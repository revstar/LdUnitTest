package com.ld.unittest.bean

/**
 *Create on 2023/12/13 16:46
 *author cqx
 */
data class HotKeyBean(
    val `data`: List<Data>?,
    val errorCode: Int,
    val errorMsg: String?
)

data class Data(
    val category: String?,
    val icon: String?,
    val id: Int,
    val link: String?,
    val name: String?,
    val order: Int,
    val visible: Int
)