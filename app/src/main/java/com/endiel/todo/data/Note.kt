package com.endiel.todo.data

import androidx.annotation.StringRes
import androidx.compose.foundation.lazy.LazyListScope
import com.endiel.todo.R

data class Note(@StringRes val title: Int, @StringRes val body: Int, @StringRes val time: Int)
val notes = listOf<Note>(
    Note(R.string.title, R.string.body, R.string.time),
    Note(R.string.title2, R.string.body2, R.string.time2),
    Note(R.string.title2, R.string.body2, R.string.time2),
    Note(R.string.title2, R.string.body2, R.string.time2),
    Note(R.string.title2, R.string.body2, R.string.time2),
    Note(R.string.title2, R.string.body2, R.string.time2),
    Note(R.string.title2, R.string.body2, R.string.time2),
    Note(R.string.title2, R.string.body2, R.string.time2),
    Note(R.string.title2, R.string.body2, R.string.time2),
    Note(R.string.title2, R.string.body2, R.string.time2),
    Note(R.string.title2, R.string.body2, R.string.time2),
    Note(R.string.title2, R.string.body2, R.string.time2),
    Note(R.string.title2, R.string.body2, R.string.time2),
    Note(R.string.title2, R.string.body2, R.string.time2)
)
