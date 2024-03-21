package com.endiel.todo.ui.theme.screens

import android.annotation.SuppressLint
import android.content.res.Configuration
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
import com.endiel.todo.data.Note
import com.endiel.todo.data.notes
import com.endiel.todo.ui.theme.Shapes
import com.endiel.todo.ui.theme.ToDoTheme
import com.endiel.todo.ui.theme.fredokaFamily

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Scaffold(
        floatingActionButton = {
            AddNoteFloatingBtn(onClick = { /*TODO*/ }) },
        floatingActionButtonPosition = FabPosition.Center,
        content = {
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
                    // A Personal Category Card
                    Card(
                        modifier = Modifier.padding(dimensionResource(R.dimen.padding_large)),
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = dimensionResource(R.dimen.card_elevation_small)),
                        shape = Shapes.small,
                        colors = CardDefaults.cardColors(
                            containerColor = MaterialTheme.colorScheme.onPrimary
                        )
                    ) {
                        Image(
                            painter = painterResource(R.drawable.person),
                            contentDescription = stringResource(R.string.logo),
                            colorFilter = ColorFilter.tint(
                                color = MaterialTheme.colorScheme.primary
                            ),
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
                    // A Work Category Card
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
                    // A Shopping Category Card
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
                    // A Health Category Card
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
                    // A Random Category Card
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
            // Tasks heading
            Text(
                text = stringResource(R.string.task_counter),
                fontFamily = fredokaFamily,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(dimensionResource(R.dimen.padding_large))
                    .align(alignment = Alignment.Start)
            )
            // A Lazy column containing note cards
            LazyColumn() {
                items(notes) {
                    NoteItem(
                        note = it,
                        modifier = Modifier.padding(dimensionResource(R.dimen.padding_small))
                    )
                }
            }
        }
    }
        }
    )
}

@Composable
fun NoteItem(note: Note,modifier: Modifier = Modifier) {
    Card(
        elevation = CardDefaults.cardElevation(
            defaultElevation = dimensionResource(R.dimen.card_elevation_extra_small)),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.onPrimary),
        modifier = modifier.padding(dimensionResource(R.dimen.padding_small))
    ) {
        Row(
            modifier = Modifier
                .padding(dimensionResource(R.dimen.padding_large))
                .fillMaxWidth(), Arrangement.SpaceBetween
        ) {
            Text(
                text = stringResource(androidx.compose.material3.R.string.bottom_sheet_collapse_description),
                fontFamily = fredokaFamily,
                fontWeight = FontWeight.Normal,
                modifier = Modifier
                    .align(alignment = Alignment.CenterVertically)
            )

            //Spacer(modifier = Modifier.width(48.dp))
            // TODO Time has to be placed at the right end, instead of Spacer
            Text(
                text = stringResource(R.string.time),
                fontFamily = fredokaFamily,
                fontWeight = FontWeight.Light,
                fontSize = 12.sp,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier
            )
        }

        Column(modifier = Modifier
            .align(alignment = Alignment.End)
            .padding(dimensionResource(R.dimen.padding_small))) {
            Image(
                painter = painterResource(R.drawable.arrow_down),
                contentDescription = stringResource(R.string.arrow_down),
                colorFilter = ColorFilter.tint(color = MaterialTheme.colorScheme.primary),
                modifier = modifier
                    .size(30.dp)
            )
        }
    }
}

@Composable
fun AddNoteFloatingBtn(onClick: ()-> Unit) {
    FloatingActionButton(
        onClick = { /*TODO*/ },
        shape = CircleShape,
        containerColor = MaterialTheme.colorScheme.primary,
        contentColor = MaterialTheme.colorScheme.onPrimary) {
            Icon(Icons.Filled.Add, "Add a note")
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
