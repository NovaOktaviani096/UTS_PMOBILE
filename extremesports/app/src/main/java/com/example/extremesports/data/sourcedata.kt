package com.example.extremesports.data

import com.example.extremesports.R
import com.example.extremesports.model.extreme_sports

class sourcedata {
    fun loadAffirmations(): List<extreme_sports> {
        return listOf<extreme_sports>(
            extreme_sports(R.string.affirmation1,R.drawable.big_wafe_surfing),
            extreme_sports(R.string.affirmation2,R.drawable.base_jumping),
            extreme_sports(R.string.affirmation3,R.drawable.bull_riding),
            extreme_sports(R.string.affirmation4,R.drawable.wingsuit_flying),
            extreme_sports(R.string.affirmation5,R.drawable.slacklining),
            extreme_sports(R.string.affirmation6,R.drawable.cliff_diving),
            extreme_sports(R.string.affirmation7,R.drawable.rock_climbing),
            extreme_sports(R.string.affirmation8,R.drawable.creeking),
            extreme_sports(R.string.affirmation9,R.drawable.paragliding),
            extreme_sports(R.string.affirmation10,R.drawable.bungee_jumping)
        )
    }

}