package com.endiel.todo.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.endiel.todo.R
import com.endiel.todo.ToDoApp
import com.endiel.todo.ui.theme.ToDoTheme

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Surface(modifier = modifier.fillMaxSize()) {
        Column {
            Card(
                modifier = Modifier.padding(16.dp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 8.dp),
                shape = RoundedCornerShape(24.dp),
                colors = CardDefaults
                    .cardColors(
                        containerColor = MaterialTheme
                            .colorScheme.surfaceVariant
                    ),
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth().padding(16.dp)
                ) {
                    Text(
                        text = stringResource(R.string.front_title),
                        modifier
                            .padding(start = 24.dp)
                            .align(alignment = Alignment.CenterVertically)
                    )
                    Image(
                        painter = painterResource(R.drawable.logo),
                        contentDescription = stringResource(R.string.logo),
                        modifier = modifier
                            .size(80.dp)
                            .padding(end = 24.dp)
                    )
                }
            }
            Text(text = stringResource(R.string.categories), modifier = Modifier.padding(16.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    ToDoTheme {
        ToDoApp()
    }
}
