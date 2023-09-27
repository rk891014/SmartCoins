package com.example.myapplication

data class RewardsData(
    val rewardCoins : String = "Rewarded coins",
    val coins : String = "10",
    val convertToGoldButton : String = "Converted",
    val planEveryDayCard : CardsData = CardsData(),
    val specialRewardsCard : CardsData = CardsData("Special Rewards"
        ,"on gold purchases above 50","BUY GOLD","Purchase Gold", "-1")
)

data class CardsData(
    val heading : String = "Plan EveryDay",
    val subHeading : String = "to win amazing rewards",
    val buttonText : String = "SPIN NOW",
    val cardHeading : String = "Daily Rewards",
    val remainingSpins : String = "2",
    )
