package com.k3kc.gmailuiclone

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AllInbox
import androidx.compose.material.icons.outlined.Inbox
import androidx.compose.ui.graphics.vector.ImageVector

sealed class DrawerMenuData(
    val icon: ImageVector? = null,
    val title: String? = null,
    val isDivider: Boolean = false,
    val isHeader: Boolean = false
) {

    object AllInboxes: DrawerMenuData(
        icon = Icons.Outlined.AllInbox,
        title = "All Inbox"
    )

    object Primary: DrawerMenuData(
        icon = Icons.Outlined.Inbox,
        title = "Primary"
    )


}
