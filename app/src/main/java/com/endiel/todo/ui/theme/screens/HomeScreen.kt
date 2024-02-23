package com.endiel.todo.ui.theme.screens

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.endiel.todo.R
import com.endiel.todo.ToDoApp
import com.endiel.todo.ui.theme.Shapes
import com.endiel.todo.ui.theme.ToDoTheme
import com.endiel.todo.ui.theme.fredokaFamily

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Surface(modifier = modifier.fillMaxSize()) {
        Column(modifier = modifier) {
            Card(
                modifier = Modifier.padding(dimensionResource(R.dimen.padding_large)),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = dimensionResource(R.dimen.card_elevation_small)),
                shape = Shapes.large,
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primary)
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(dimensionResource(R.dimen.padding_large))
                ) {
                    Text(
                        text = stringResource(R.string.front_title),
                        modifier
                            .padding(start = dimensionResource(R.dimen.padding_extra_large))
                            .align(alignment = Alignment.CenterVertically)
                    )
                    Image(
                        painter = painterResource(R.drawable.logo),
                        contentDescription = stringResource(R.string.logo),
                        modifier = modifier
                            .size(80.dp)
                            .padding(dimensionResource(R.dimen.padding_medium))
                    )
                }
            }

            Text(
                text = stringResource(R.string.categories),
                fontFamily = fredokaFamily,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(dimensionResource(R.dimen.padding_large))
                    .align(alignment = Alignment.Start)
            )
            // A Row for Categories
            Row(
                modifier = Modifier.fillMaxWidth(),
                Arrangement.Absolute.SpaceEvenly
            ) {
                Column {
                    // work Card
                    Card(
                        modifier = Modifier.padding(dimensionResource(R.dimen.padding_large)),
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = dimensionResource(R.dimen.card_elevation_small)),
                        shape = Shapes.small,
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.onPrimary)
                    ) {
                        Image(
                            painter = painterResource(R.drawable.person),
                            contentDescription = stringResource(R.string.logo),
                            colorFilter = ColorFilter.tint(color = MaterialTheme.colorScheme.primary),
                            modifier = modifier
                                .size(40.dp)
                                .padding(dimensionResource(R.dimen.padding_medium))
                        )
                    }

                    Text(
                        stringResource(R.string.personal),
                        fontFamily = fredokaFamily,
                        fontWeight = FontWeight.Light,
                        fontSize = 12.sp,
                        color = MaterialTheme.colorScheme.primary,
                        modifier = Modifier
                            .align(alignment = Alignment.CenterHorizontally)
                    )
                }

                Column(modifier = Modifier) {
                    // work Card
                    Card(
                        modifier = Modifier.padding(dimensionResource(R.dimen.padding_large)),
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = dimensionResource(R.dimen.card_elevation_small)),
                        shape = Shapes.small,
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.onPrimary)
                    ) {
                        Image(
                            painter = painterResource(R.drawable.work),
                            contentDescription = stringResource(R.string.logo),
                            colorFilter = ColorFilter.tint(color = MaterialTheme.colorScheme.primary),
                            modifier = modifier
                                .size(40.dp)
                                .padding(dimensionResource(R.dimen.padding_medium))
                        )
                    }

                    Text(
                        stringResource(R.string.work),
                        fontFamily = fredokaFamily,
                        fontWeight = FontWeight.Light,
                        fontSize = 12.sp,
                        color = MaterialTheme.colorScheme.primary,
                        modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
                    )
                }
                Column(modifier = Modifier) {
                    // Shopping Card
                    Card(
                        modifier = Modifier.padding(dimensionResource(R.dimen.padding_large)),
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = dimensionResource(R.dimen.card_elevation_small)),
                        shape = Shapes.small,
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.onPrimary)
                    ) {
                        Image(
                            painter = painterResource(R.drawable.shopping),
                            contentDescription = stringResource(R.string.logo),
                            colorFilter = ColorFilter.tint(color = MaterialTheme.colorScheme.primary),
                            modifier = modifier
                                .size(40.dp)
                                .padding(dimensionResource(R.dimen.padding_medium))
                        )
                    }

                    Text(
                        stringResource(R.string.shopping),
                        fontFamily = fredokaFamily,
                        fontWeight = FontWeight.Light,
                        fontSize = 12.sp,
                        color = MaterialTheme.colorScheme.primary,
                        modifier = Modifier
                            .align(alignment = Alignment.CenterHorizontally)
                    )
                }

                Column(
                    modifier = Modifier
                ) {
                    // Health Card
                    Card(
                        modifier = Modifier.padding(dimensionResource(R.dimen.padding_large)),
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = dimensionResource(R.dimen.card_elevation_small)),
                        shape = Shapes.small,
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.onPrimary)
                    ) {
                        Image(
                            painter = painterResource(R.drawable.health),
                            contentDescription = stringResource(R.string.logo),
                            colorFilter = ColorFilter.tint(color = MaterialTheme.colorScheme.primary),
                            modifier = modifier
                                .size(40.dp)
                                .padding(dimensionResource(R.dimen.padding_medium))
                        )
                    }

                    Text(
                        stringResource(R.string.health),
                        fontFamily = fredokaFamily,
                        fontWeight = FontWeight.Light,
                        fontSize = 12.sp,
                        color = MaterialTheme.colorScheme.primary,
                        modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
                    )
                }

                Column(modifier = Modifier) {
                    // Health Card
                    Card(
                        modifier = Modifier.padding(dimensionResource(R.dimen.padding_large)),
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = dimensionResource(R.dimen.card_elevation_small)),
                        shape = Shapes.small,
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.onPrimary)
                    ) {
                        Image(
                            painter = painterResource(R.drawable.random),
                            contentDescription = stringResource(R.string.logo),
                            colorFilter = ColorFilter.tint(color = MaterialTheme.colorScheme.primary),
                            modifier = modifier
                                .size(40.dp)
                                .padding(dimensionResource(R.dimen.padding_medium))
                        )
                    }

                    Text(
                        stringResource(R.string.random),
                        fontFamily = fredokaFamily,
                        fontWeight = FontWeight.Light,
                        fontSize = 12.sp,
                        color = MaterialTheme.colorScheme.primary,
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
                    .padding(dimensionResource(R.dimen.padding_large))
                    .align(alignment = Alignment.Start)
            )
            // Tasks list Card
            // TODO This card is going to be in a Lazy Column
            Card(
                modifier = Modifier
                    .padding(dimensionResource(R.dimen.padding_large))
                    .fillMaxWidth(),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = dimensionResource(R.dimen.card_elevation_medium)),
                shape = Shapes.medium,
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.onPrimary)
            ) {
                Row(
                    modifier = Modifier
                        .padding(dimensionResource(R.dimen.padding_extra_large))
                        .fillMaxWidth(), Arrangement.SpaceBetween
                ) {
                    Image(
                        painter = painterResource(R.drawable.radio_button),
                        contentDescription = stringResource(R.string.logo),
                        colorFilter = ColorFilter.tint(color = MaterialTheme.colorScheme.primary),
                        modifier = modifier
                            .size(15.dp)
                            .align(alignment = Alignment.CenterVertically)
                    )

                    Text(
                        text = "Daily Code Challenge from..",
                        fontFamily = fredokaFamily,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier
                            .align(alignment = Alignment.CenterVertically)
                    )

                    //Spacer(modifier = Modifier.width(48.dp))
                    // TODO Time has to be placed at the right end, instead of Spacer
                    Text(
                        text = "9:00 am",
                        fontFamily = fredokaFamily,
                        fontWeight = FontWeight.Light,
                        fontSize = 12.sp,
                        color = MaterialTheme.colorScheme.primary,
                        modifier = Modifier
                            .align(alignment = Alignment.CenterVertically),
                    )
                }
            }
        }
    }
}

@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO
)
@Composable
fun ToDoLightPreview() {
    ToDoTheme {
        ToDoApp()
    }
}

@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Composable
fun ToDoDarkPreview() {
    ToDoTheme {
        ToDoApp()
    }
}
