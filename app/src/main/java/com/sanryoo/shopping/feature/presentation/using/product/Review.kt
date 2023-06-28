package com.sanryoo.shopping.feature.presentation.using.product

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.google.accompanist.permissions.isGranted
import com.sanryoo.shopping.R
import com.sanryoo.shopping.ui.theme.Primary

@Composable
fun Review(

) {
//
//    Column(modifier = Modifier.fillMaxWidth()) {
//        Box(modifier = Modifier.fillMaxWidth()) {
//            BasicTextField(
//                value = state.comment,
//                onValueChange = onCommentChange,
//                modifier = Modifier
//                    .align(Alignment.CenterStart)
//                    .padding(15.dp)
//                    .padding(end = 20.dp)
//                    .fillMaxWidth(),
//                textStyle = TextStyle(fontSize = 16.sp)
//            )
//            Icon(
//                painter = painterResource(id = R.drawable.send),
//                contentDescription = "Icon send",
//                modifier = Modifier
//                    .align(Alignment.BottomEnd)
//                    .padding(5.dp)
//                    .size(25.dp)
//                    .clickable(
//                        interactionSource = MutableInteractionSource(),
//                        indication = null,
//                        onClick = onSendReview
//                    )
//            )
//            if (state.comment.isEmpty()) {
//                Text(
//                    text = "Write a comment",
//                    modifier = Modifier
//                        .align(Alignment.CenterStart)
//                        .padding(15.dp)
//                        .fillMaxWidth(),
//                    color = MaterialTheme.colors.onBackground.copy(alpha = 0.5f)
//                )
//            }
//        }
//        Text(
//            text = "Image: ",
//            modifier = Modifier
//                .padding(5.dp)
//                .padding(start = 10.dp)
//        )
//        LazyRow(
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(100.dp),
//            contentPadding = PaddingValues(5.dp),
//            horizontalArrangement = Arrangement.spacedBy(5.dp)
//        ) {
//            itemsIndexed(state.listImagesComment) { index, photoUrl ->
//                Box(
//                    modifier = Modifier
//                        .fillMaxHeight()
//                        .aspectRatio(1f)
//                ) {
//                    AsyncImage(
//                        model = photoUrl,
//                        contentDescription = "Image comment",
//                        modifier = Modifier
//                            .fillMaxSize()
//                            .padding(10.dp)
//                    )
//                    Box(
//                        modifier = Modifier
//                            .align(Alignment.TopEnd)
//                            .clip(CircleShape)
//                            .background(MaterialTheme.colors.background)
//                            .border(1.dp, Color.Red, CircleShape)
//                            .clickable(interactionSource = MutableInteractionSource(),
//                                indication = null,
//                                onClick = {
//                                    val tempList =
//                                        state.listImagesComment.toMutableList()
//                                    tempList.removeAt(index)
//                                    onListImageCommentChange(tempList)
//                                }
//                            )
//                    ) {
//                        Icon(
//                            painter = painterResource(id = R.drawable.close),
//                            contentDescription = "Icon close",
//                            tint = Color.Red,
//                            modifier = Modifier
//                                .padding(10.dp)
//                                .size(15.dp)
//                        )
//                    }
//                }
//            }
//            item {
//                Box(
//                    modifier = Modifier
//                        .fillMaxHeight()
//                        .aspectRatio(1f)
//                        .clip(RoundedCornerShape(5.dp))
//                        .border(
//                            width = 1.dp,
//                            color = Primary,
//                            shape = RoundedCornerShape(5.dp)
//                        )
//                        .clickable(
//                            interactionSource = MutableInteractionSource(),
//                            indication = null,
//                            onClick = {
//                                setSheetContent(SheetContent.CHOOSE_IMAGES)
//                                if (readImagePermission.status.isGranted) {
//                                    setShowBottomSheet(true)
//                                } else {
//                                    readImagePermission.launchPermissionRequest()
//                                }
//                            }
//                        ),
//                    contentAlignment = Alignment.Center
//                ) {
//                    Text(text = "+ Add", color = Primary)
//                }
//            }
//        }
//    }
//    Spacer(
//        modifier = Modifier
//            .fillMaxWidth()
//            .height(10.dp)
//            .background(MaterialTheme.colors.surface)
//    )

}