package com.example.android_lab_3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val books = listOf(
            Book("1984", "George Orwell", R.drawable.book_1984),
            Book("To kill a Mockingbird", "Harper Lee", R.drawable.to_kill_a_mockingbird),
            Book("The great Gatsby", "F. Scott Fitzgerald", R.drawable.the_great_gatsby),
            Book("Three comrades", "Erich Maria Remarque", R.drawable.comrads),
            Book("Arch of triumph", "Erich Maria Remarque", R.drawable.arch),
            Book("Crime and punishment", "Fedor Dostoevsky", R.drawable.crime),
            Book("Fahrenheit 451", "Ray Bradbury", R.drawable.fahrengeit),
            Book("A farewell to arms", "Ernest Hemingway", R.drawable.farewell),
            Book("Norwegian forest", "Haruki Murakami", R.drawable.forest),
            Book("Kafka on the stone", "Haruki Murakami", R.drawable.kafka),
            Book("Eugene Onegin", "Alexander Pushkin", R.drawable.onegin),
            Book("Painted Veil", "Somerset Maugham", R.drawable.veil),
            Book("The razor's edge", "Somerset Maugham", R.drawable.razor),
            Book("The illustrated man", "Ray Bradbury", R.drawable.man)
        )

        val adapter = BookAdapter(books)
        recyclerView.adapter = adapter
    }
}
