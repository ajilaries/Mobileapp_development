package com.example.myapplication


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TodoAdapter(
    private val todoList: List<Todo>
) : RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {

    class TodoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val checkBox: CheckBox = itemView.findViewById(R.id.checkTodo)
        val title: TextView = itemView.findViewById(R.id.tvTodo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_todo, parent, false)
        return TodoViewHolder(view)
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        val todo = todoList[position]

        holder.title.text = todo.title
        holder.checkBox.isChecked = todo.isDone

        holder.checkBox.setOnCheckedChangeListener { _, isChecked ->
            todo.isDone = isChecked
        }
    }

    override fun getItemCount(): Int = todoList.size
}
