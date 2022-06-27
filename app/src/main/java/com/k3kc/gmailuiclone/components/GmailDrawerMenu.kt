package com.k3kc.gmailuiclone.components

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.k3kc.gmailuiclone.DrawerMenuData

@Composable
fun GmailDrawerMenu(scrollState: ScrollState) {

    val menuList = listOf<DrawerMenuData>(
        DrawerMenuData.Divider,
        DrawerMenuData.AllInboxes,
        DrawerMenuData.Divider,
        DrawerMenuData.Primary,
        DrawerMenuData.Social,
        DrawerMenuData.Promotions,
        DrawerMenuData.HeaderOne,
        DrawerMenuData.Starred,
        DrawerMenuData.Snoozed,
        DrawerMenuData.Important,
        DrawerMenuData.Sent,
        DrawerMenuData.Schedule,
        DrawerMenuData.Outbox,
        DrawerMenuData.Draft,
        DrawerMenuData.AllEmail,
        DrawerMenuData.HeaderTwo,
        DrawerMenuData.Calendar,
        DrawerMenuData.Contacts,
        DrawerMenuData.Divider,
        DrawerMenuData.Settings,
        DrawerMenuData.Help
    )

    Column(Modifier.verticalScroll(scrollState)) {
        Text("Gmail",
            color = Color.Red,
            modifier = Modifier.padding(
                start = 20.dp,
                top = 20.dp
            ),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        
        menuList.forEach { 
            MailDrawerItem(item = it)
        }
        
    }

}

@Composable
fun MailDrawerItem(item: DrawerMenuData) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .padding(top = 16.dp)
    ) {

        when {
            item.isDivider -> {
                Divider(modifier = Modifier.padding(top = 20.dp))
            }
            item.isHeader -> {
                Text(
                    text = item.title,
                    fontWeight = FontWeight.Light,
                    modifier = Modifier.padding(start = 20.dp)
                )
            } else -> {
                Image(
                    imageVector = item.icon!!,
                    contentDescription = item.title,
                    modifier = Modifier.weight(0.5f)
                )
                Text(text = item.title, modifier = Modifier.weight(2.0f))
            }
        }

    }
}