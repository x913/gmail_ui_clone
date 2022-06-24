package com.k3kc.gmailuiclone.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.k3kc.gmailuiclone.GmailApp
import com.k3kc.gmailuiclone.R
import com.k3kc.gmailuiclone.ui.theme.GMailUICloneTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun HomeAppBar(scaffoldState: ScaffoldState, scope: CoroutineScope) {

    var searchText by remember {
       mutableStateOf("")
    }

    Box(modifier = Modifier.padding(10.dp)) {
        Card(elevation = 6.dp,
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.requiredHeight(50.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp)
            ) {
                IconButton(onClick = {
                    scope.launch {
                        scaffoldState.drawerState.open()
                    }
                }) {
                    Icon(Icons.Default.Menu, "Menu",)
                }
                Text(
                    "Search in emails",
                    textAlign = TextAlign.Start,
                    modifier = Modifier.weight(2f)
                )
                Image(
                    modifier = Modifier
                        .size(30.dp)
                        .clip(CircleShape)
                        .background(Color.Cyan),
                    painter = painterResource(id = R.drawable.ic_cruelty),
                    contentDescription = "icon"
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GMailUICloneTheme {
        GmailApp()
    }
}