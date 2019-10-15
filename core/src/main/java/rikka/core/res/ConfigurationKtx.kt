package rikka.core.res

import android.content.res.Configuration
import android.view.View

fun Configuration.isRtl(): Boolean {
    return layoutDirection == View.LAYOUT_DIRECTION_RTL
}

fun Configuration.isLtr(): Boolean {
    return layoutDirection == View.LAYOUT_DIRECTION_LTR
}

fun Configuration.isNight(): Boolean {
    return uiMode and Configuration.UI_MODE_NIGHT_YES == Configuration.UI_MODE_NIGHT_YES
}