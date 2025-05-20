package com.kashmir.imotiveprofileapp.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kashmir.imotiveprofileapp.R

@Preview
@Composable
private fun ProfileScreenPreview() {
    ProfileScreen()
}

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF121212))
            .padding(6.dp)
    ) {
        Box(modifier = Modifier.wrapContentSize()) {
            Column(
                modifier = Modifier
                    .background(Color(0xFF161616))
                    .padding(16.dp)
            ) {
                // Top App Bar
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(R.drawable.arrow),
                        contentDescription = "Back",
                        tint = Color.White,
                        modifier = Modifier
                            .padding(end = 16.dp)
                            .size(24.dp)
                            .graphicsLayer {
                                scaleX = -1f
                            }
                    )


                    Text(
                        text = "Profile", color = Color.White, fontSize = 18.sp,
                        modifier = Modifier.weight(1f)
                    )
                    OutlinedButton(
                        onClick = {},
                        border = BorderStroke(0.5.dp, Color.DarkGray),
                        shape = CircleShape,
                        modifier = Modifier.height(36.dp)
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.chat),
                            contentDescription = "communication",
                            tint = Color.Gray,

                            modifier = Modifier
                                .size(24.dp)
                                .padding(end = 6.dp)
                                .graphicsLayer {
                                    scaleX = -1f
                                }
                        )
                        Text("support", color = Color.Gray, fontSize = 12.sp)
                    }
                }

                Spacer(modifier = Modifier.height(22.dp))

                // Profile Info
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(R.drawable.profile_picture), // use your image here
                        contentDescription = "Profile",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(56.dp)
                            .clip(CircleShape)
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Column {
                        Text("andaz Kumar", color = Color.White, fontSize = 16.sp)
                        Text("member since Dec, 2020", color = Color.Gray, fontSize = 12.sp)
                    }
                    Spacer(Modifier.weight(1f))
                    Icon(
                        painter = painterResource(R.drawable.pen),
                        contentDescription = "Edit",
                        tint = Color.Gray,
                        modifier = Modifier.size(24.dp)
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                // Card Section
                Card(
                    colors = CardDefaults.cardColors(Color(0xFF121212)),
                    border = BorderStroke(1.dp, Color.DarkGray),
                    shape = RoundedCornerShape(0.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                    ) {
                        Row(
                            modifier = Modifier.padding(16.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(32.dp)
                                    .clip(CircleShape)
                                    .background(Color.Transparent)
                                    .border(0.5.dp, Color.White, CircleShape),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    painter = painterResource(R.drawable.car),
                                    contentDescription = "Car",
                                    tint = Color.White,
                                    modifier = Modifier
                                        .size(24.dp)
                                        .graphicsLayer {
                                            scaleX = -1f
                                        }
                                )
                            }
                            Spacer(modifier = Modifier.width(12.dp))
                            Column {
                                Text(
                                    "get to know your vehicles, inside out",
                                    color = Color.White,
                                    fontSize = 12.sp
                                )
                                Spacer(modifier = Modifier.height(8.dp))
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Text(
                                        "CRED garage ",
                                        color = Color.White,
                                        fontSize = 16.sp,
                                        modifier = Modifier.padding(end = 8.dp)
                                    )
                                    Icon(
                                        painter = painterResource(R.drawable.arrow),
                                        contentDescription = "arrow",
                                        tint = Color.White,
                                        modifier = Modifier.size(24.dp)
                                    )

                                }
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                // Info Fields
                InfoSection(
                    painterResource(R.drawable.pin),
                    "credit score",
                    "- REFRESH AVAILABLE",
                    "757",
                    Color.Green
                )
                HorizontalDivider(color = Color.DarkGray, thickness = 1.dp)
                InfoSection(
                    painterResource(R.drawable.rupee),
                    "lifetime cashback",
                    "",
                    "₹3",
                    Color.White
                )
                HorizontalDivider(color = Color.DarkGray, thickness = 1.dp)
                InfoSection(
                    painterResource(R.drawable.bank_account),
                    "bank balance",
                    "",
                    "check",
                    Color.White
                )

            }
        }
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                "YOUR REWARDS & BENEFITS",
                letterSpacing = 2.sp,
                color = Color.Gray,
                fontSize = 14.sp
            )
            Spacer(modifier = Modifier.height(16.dp))
            // Your Rewards and Benefits section
            RewardInfoSection("cashback balance", "₹0")
            HorizontalDivider(
                color = Color.DarkGray,
                thickness = 1.dp,
                modifier = Modifier.padding(vertical = 16.dp)
            )
            RewardInfoSection("coins", "26,46,783")
            HorizontalDivider(
                color = Color.DarkGray,
                thickness = 1.dp,
                modifier = Modifier.padding(vertical = 16.dp)
            )
            RewardInfoSection("win upto Rs 1000", "refer and earn")

        }

        // Transactions and Support
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                "TRANSACTIONS & SUPPORT",
                letterSpacing = 2.sp,
                color = Color.Gray,
                fontSize = 14.sp
            )
            Spacer(modifier = Modifier.height(16.dp))

            Row(verticalAlignment = Alignment.CenterVertically) {
                Text("all transactions", color = Color.White, modifier = Modifier.weight(1f))
                Icon(
                    Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = "Arrow",
                    tint = Color.Gray
                )

            }

        }


    }

}

@Composable
fun InfoSection(
    icon: Painter,
    title: String,
    subtitle: String,
    value: String,
    subtitleColor: Color,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(24.dp)
                .clip(CircleShape)
                .background(Color.Transparent)
                .padding(2.dp)
                .border(0.5.dp, Color.DarkGray, CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                icon,
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier
                    .size(16.dp)
                    .padding(2.dp)
            )
        }
        Spacer(modifier = Modifier.width(12.dp))

        Row(
            modifier = Modifier.weight(1f),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = title, color = Color.White, fontSize = 14.sp)
            if (subtitle.isNotEmpty()) {
                Text(
                    text = subtitle,
                    color = subtitleColor,
                    fontSize = 10.sp,
                    letterSpacing = 1.8.sp,
                    style = TextStyle(
                        fontWeight = FontWeight.Bold
                    ),
                    modifier = Modifier.padding(start = 5.dp)
                )
            }
        }
        Text(
            text = value,
            color = Color.White,
            fontSize = 14.sp,
            modifier = Modifier.padding(end = 12.dp)
        )
        Icon(
            painter = painterResource(R.drawable.arrow),
            contentDescription = "Arrow",
            tint = Color.Gray,
            modifier = Modifier.size(24.dp)
        )
    }
}

@Composable
fun RewardInfoSection(
    title: String,
    subtitle: String,
    modifier: Modifier = Modifier
) {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
    ) {

        Column(modifier = Modifier.weight(1f)) {
            Text(text = title, color = Color.White)
            Spacer(modifier = Modifier.height(5.dp))
            Text(text = subtitle, color = Color.DarkGray)
        }

        Icon(
            Icons.AutoMirrored.Filled.KeyboardArrowRight,
            contentDescription = "Arrow",
            tint = Color.Gray
        )

    }

}
