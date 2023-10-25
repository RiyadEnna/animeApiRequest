package com.example.mangaapirequest

interface MangaItemCallback {
    fun onCellClick(manga:Data)
    fun onSaveManga(manga:Data)
}