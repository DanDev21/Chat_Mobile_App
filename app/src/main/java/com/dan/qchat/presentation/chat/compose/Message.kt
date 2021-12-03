package com.dan.qchat.presentation.chat.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.dan.qchat.domain.model.Message

@Composable
fun Message(
    message: Message,
    isMine: Boolean
) {
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = if (isMine) Alignment.CenterEnd else Alignment.CenterStart
    ) {
        Column(
            modifier = Modifier
                .width(200.dp)
                .background(
                    color = if (isMine) Color.Green else Color.LightGray,
                    shape = RoundedCornerShape(20.dp)
                )
                .padding(8.dp)
        ) {
            Text(
                text = message.username,
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = message.body,
                color = Color.White
            )
            Text(
                text = message.formattedTimestamp,
                color = Color.White,
                modifier = Modifier.align(Alignment.End)
            )
        }
    }
}
