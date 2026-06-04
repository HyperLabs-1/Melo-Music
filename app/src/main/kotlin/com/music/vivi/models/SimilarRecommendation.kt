

package iad1tya.melo.music.models

import com.music.innertube.models.YTItem
import iad1tya.melo.music.db.entities.LocalItem

data class SimilarRecommendation(
    val title: LocalItem,
    val items: List<YTItem>,
)
