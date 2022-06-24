package com.k3kc.gmailuiclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.k3kc.gmailuiclone.components.GmailDrawerMenu
import com.k3kc.gmailuiclone.components.HomeAppBar
import com.k3kc.gmailuiclone.ui.theme.GMailUICloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GMailUICloneTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    GmailApp()
                }
            }
        }
    }
}

@Composable
fun GmailApp() {

    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            HomeAppBar(scaffoldState, coroutineScope)
        }, drawerContent = {
            GmailDrawerMenu()
        }) {
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GMailUICloneTheme {
        GmailApp()
    }
}