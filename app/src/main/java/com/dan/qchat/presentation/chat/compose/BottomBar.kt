package com.dan.qchat.presentation.chat.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BottomChatBar(
    modifier: Modifier,
    text: String,
    onTextChangeListener: (String) -> Unit,
    onClickListener: () -> Unit
) {
    Row(
        modifier = modifier
    ) {
        TextField(
            value = text,
            onValueChange = onTextChangeListener,
            placeholder = {
                Text(text = "Aa...")
            },
            modifier = Modifier
                .weight(1f)
                .clip(RoundedCornerShape(20.dp))
                .background(Color.LightGray)
        )
        Spacer(modifier = Modifier.width(16.dp))
        IconButton(
            modifier = Modifier
                .clip(RoundedCornerShape(25.dp))
                .background(Color.Blue),
            onClick = onClickListener
        ) {
            Icon(
                imageVector = Icons.Default.Send,
                contentDescription = "Send"
            )
        }
    }
}
