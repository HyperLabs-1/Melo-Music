

package com.hyperlabs.melo.models

import com.music.innertube.models.YTItem
import com.hyperlabs.melo.db.entities.LocalItem

data class SimilarRecommendation(
    val title: LocalItem,
    val items: List<YTItem>,
)
