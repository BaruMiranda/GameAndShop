package com.barcod.juegabebe.ui.container.fourgame

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.ObjectAnimator
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.barcod.juegabebe.R
import com.barcod.juegabebe.data.model.CardModel
import android.os.Handler
import android.os.Looper

class CardAdapter(private val cards: MutableList<CardModel>) : RecyclerView.Adapter<CardAdapter.CardViewHolder>() {

    private var isSelectionEnabled = true

    class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivCardFront: ImageView = itemView.findViewById(R.id.ivCardFront)
        val ivCardBack: ImageView = itemView.findViewById(R.id.ivCardBack)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_card, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val card = cards[position]

        if (card.isRevealed) {
            holder.ivCardBack.visibility = View.GONE
            holder.ivCardFront.visibility = View.VISIBLE
            holder.ivCardFront.setImageResource(getCardDrawable(card.letter))
        } else {
            holder.ivCardBack.visibility = View.VISIBLE
            holder.ivCardFront.visibility = View.GONE
        }

        holder.itemView.setOnClickListener {
            if (isSelectionEnabled && !card.isRevealed) {
                isSelectionEnabled = false
                revealCard(holder, card)
                Handler(Looper.getMainLooper()).postDelayed({
                    shuffleAndHideCards()
                    isSelectionEnabled = true
                }, 2000)
            }
        }
    }

    override fun getItemCount(): Int = cards.size

    private fun getCardDrawable(letter: String): Int {
        return when (letter) {
            "T" -> R.drawable.t
            "O" -> R.drawable.o
            "D" -> R.drawable.d
            "I" -> R.drawable.i
            else -> R.drawable.carta_off
        }
    }

    private fun revealCard(holder: CardViewHolder, card: CardModel) {
        // Animación para voltear la carta
        val scaleX = ObjectAnimator.ofFloat(holder.itemView, "scaleX", 1f, 0f)
        val scaleXBack = ObjectAnimator.ofFloat(holder.itemView, "scaleX", 0f, 1f)

        scaleX.addListener(object : AnimatorListenerAdapter() {
            override fun onAnimationEnd(animation: Animator) {
                holder.ivCardBack.visibility = View.GONE
                holder.ivCardFront.visibility = View.VISIBLE
                holder.ivCardFront.setImageResource(getCardDrawable(card.letter))
                scaleXBack.start()
            }
        })

        scaleX.start()
        card.isRevealed = true
    }

    private fun shuffleAndHideCards() {
        cards.shuffle()
        cards.forEach { it.isRevealed = false }
        notifyDataSetChanged()
    }
}


