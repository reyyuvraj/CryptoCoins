package tech.reyyuvraj.cryptocoins.presentation.coin_detail.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import tech.reyyuvraj.cryptocoins.data.repository.dto.CoinDetailDto.TeamMember

@Composable
fun TeamListItem(
    teamMember: TeamMember,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center
    ) {
        teamMember.name?.let {
            Text(
                text = it,
                style = MaterialTheme.typography.h4
            )
        }
        Spacer(modifier = Modifier.height(4.dp))
        teamMember.position?.let {
            Text(
                text = it,
                style = MaterialTheme.typography.body2,
                fontStyle = FontStyle.Italic
            )
        }
    }
}