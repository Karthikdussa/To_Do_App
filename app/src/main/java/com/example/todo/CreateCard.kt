package com.example.todo

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import com.example.todo.databinding.ActivityCreateCardBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.Calendar


class CreateCard : AppCompatActivity() {
    private lateinit var binding: ActivityCreateCardBinding
    private lateinit var database: myDatabase
    private var selectedDueDate: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCreateCardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        database = Room.databaseBuilder(
            applicationContext, myDatabase::class.java, "To_Do"
        ).build()

        binding.dueDateButton.setOnClickListener {
            showDatePickerDialog()
        }

        binding.saveButton.setOnClickListener {
            if (binding.createTitle.text.toString().trim { it <= ' ' }.isNotEmpty()
                && binding.createPriority.text.toString().trim { it <= ' ' }.isNotEmpty()
            ) {
                var title = binding.createTitle.getText().toString()
                var priority = binding.createPriority.getText().toString()
                val dueDate = selectedDueDate ?: "No Due Date"
                DataObject.setData(title, priority, dueDate)
                GlobalScope.launch {
                    database.dao().insertTask(Entity(0, title, priority, dueDate))

                }

                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
    private fun showDatePickerDialog() {
        val currentDate = System.currentTimeMillis() - 1000
        val datePickerDialog = DatePickerDialog(
            this, { _, year, month, dayOfMonth ->

                val selectedDate = "$year-${month + 1}-$dayOfMonth"
                selectedDueDate = selectedDate
                binding.dueDateButton.text = selectedDate
            },
            Calendar.getInstance().get(Calendar.YEAR),
            Calendar.getInstance().get(Calendar.MONTH),
            Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
        )
        datePickerDialog.datePicker.minDate = currentDate
        datePickerDialog.show()
    }
}