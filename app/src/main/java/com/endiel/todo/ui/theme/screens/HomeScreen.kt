package com.endiel.todo.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.endiel.todo.R
import com.endiel.todo.ToDoApp
import com.endiel.todo.ui.theme.ToDoTheme
import com.endiel.todo.ui.theme.fredokaFamily

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Surface(modifier = modifier.fillMaxSize()) {
        Column() {
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
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
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

            Text(
                text = stringResource(R.string.categories),
                fontFamily = fredokaFamily,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(16.dp)
                    .align(alignment = Alignment.Start)
            )
            // A Row for Categories
            Row(
                modifier = Modifier
            ) {
                Column() {
                    // work Card
                    Card(
                        modifier = Modifier.padding(16.dp),
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 8.dp),
                        shape = RoundedCornerShape(4.dp),
                        colors = CardDefaults
                            .cardColors(
                                containerColor = MaterialTheme
                                    .colorScheme.surfaceVariant
                            ),
                    ) {
                        Image(
                            painter = painterResource(R.drawable.person),
                            contentDescription = stringResource(R.string.logo),
                            modifier = modifier
                                .size(40.dp).padding(8.dp)
                        )
                    }

                    Text(
                        stringResource(R.string.personal),
                        fontFamily = fredokaFamily,
                        fontWeight = FontWeight.Light,
                        fontSize = 12.sp,
                        modifier = Modifier.align(
                            alignment = Alignment.CenterHorizontally)
                    )
                }

                Column(
                    modifier = Modifier
                ) {
                    // work Card
                    Card(
                        modifier = Modifier.padding(16.dp),
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 8.dp),
                        shape = RoundedCornerShape(4.dp),
                        colors = CardDefaults
                            .cardColors(
                                containerColor = MaterialTheme
                                    .colorScheme.surfaceVariant
                            ),
                    ) {
                        Image(
                            painter = painterResource(R.drawable.work),
                            contentDescription = stringResource(R.string.logo),
                            modifier = modifier
                                .size(40.dp).padding(8.dp)
                        )
                    }

                    Text(
                        stringResource(R.string.work),
                        fontFamily = fredokaFamily,
                        fontWeight = FontWeight.Light,
                        fontSize = 12.sp,
                        modifier = Modifier.align(
                            alignment = Alignment.CenterHorizontally)
                    )
                }
                Column(
                    modifier = Modifier
                ) {
                    // Shopping Card
                    Card(
                        modifier = Modifier.padding(16.dp),
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 8.dp),
                        shape = RoundedCornerShape(4.dp),
                        colors = CardDefaults
                            .cardColors(
                                containerColor = MaterialTheme
                                    .colorScheme.surfaceVariant
                            ),
                    ) {
                        Image(
                            painter = painterResource(R.drawable.shopping),
                            contentDescription = stringResource(R.string.logo),
                            modifier = modifier
                                .size(40.dp).padding(8.dp)
                        )
                    }

                    Text(
                        stringResource(R.string.shopping),
                        fontFamily = fredokaFamily,
                        fontWeight = FontWeight.Light,
                        fontSize = 12.sp,
                        modifier = Modifier
                            .align(alignment = Alignment.CenterHorizontally)
                    )
                }

                Column(
                    modifier = Modifier
                ) {
                    // Health Card
                    Card(
                        modifier = Modifier.padding(16.dp),
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 8.dp),
                        shape = RoundedCornerShape(4.dp),
                        colors = CardDefaults
                            .cardColors(
                                containerColor = MaterialTheme
                                    .colorScheme.surfaceVariant
                            ),
                    ) {
                        Image(
                            painter = painterResource(R.drawable.health),
                            contentDescription = stringResource(R.string.logo),
                            modifier = modifier
                                .size(40.dp).padding(8.dp)
                        )
                    }

                    Text(
                        stringResource(R.string.health),
                        fontFamily = fredokaFamily,
                        fontWeight = FontWeight.Light,
                        fontSize = 12.sp,
                        modifier = Modifier
                            .align(alignment = Alignment.CenterHorizontally)
                    )
                }

                Column(
                    modifier = Modifier
                ) {
                    // Health Card
                    Card(
                        modifier = Modifier.padding(16.dp),
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 8.dp),
                        shape = RoundedCornerShape(4.dp),
                        colors = CardDefaults
                            .cardColors(
                                containerColor = MaterialTheme
                                    .colorScheme.surfaceVariant
                            ),
                    ) {
                        Image(
                            painter = painterResource(R.drawable.random),
                            contentDescription = stringResource(R.string.logo),
                            modifier = modifier
                                .size(40.dp).padding(8.dp)
                        )
                    }

                    Text(
                        stringResource(R.string.random),
                        fontFamily = fredokaFamily,
                        fontWeight = FontWeight.Light,
                        fontSize = 12.sp,
                        modifier = Modifier
                            .align(alignment = Alignment.CenterHorizontally)
                    )
                }
            }

            Text(
                text = stringResource(R.string.task_counter),
                fontFamily = fredokaFamily,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(16.dp)
                    .align(alignment = Alignment.Start)
            )
            // Tasks list Card
            // TODO This card is going to be in a Lazy Column
            Card(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 8.dp),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults
                    .cardColors(
                        containerColor = MaterialTheme
                            .colorScheme.surfaceVariant
                    ),
            ) {
                Row(
                    modifier = Modifier.padding(24.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.radio_button),
                        contentDescription = stringResource(R.string.logo),
                        modifier = modifier
                            .size(15.dp)
                            .align(alignment = Alignment.CenterVertically)
                    )

                    Text(
                        text = "Daily Code Challenge",
                        fontFamily = fredokaFamily,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier
                            .padding(start = 24.dp)
                            .align(alignment = Alignment.CenterVertically)
                    )

                    Spacer(modifier = Modifier.width(48.dp))
                    // TODO Time has to be placed at the right end, instead of Spacer
                    Text(
                        text = "9:00 am",
                        fontFamily = fredokaFamily,
                        fontWeight = FontWeight.Light,
                        fontSize = 12.sp,
                        modifier = Modifier
                            .align(alignment = Alignment.CenterVertically)
                    )
                }
            }
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
