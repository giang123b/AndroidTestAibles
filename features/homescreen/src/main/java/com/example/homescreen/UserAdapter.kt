package com.example.homescreen

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.aibles.model.User
import com.example.homescreen.databinding.ItemUserBinding

class UserAdapter (private val viewModel: HomeViewModel): RecyclerView.Adapter<UserViewHolder>() {

    private val users: MutableList<User> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
            = UserViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_user, parent, false))

    override fun getItemCount(): Int
            = users.size

    override fun onBindViewHolder(holder: UserViewHolder, position: Int)
            = holder.bindTo(users[position], viewModel)

    fun updateData(items: List<User>) {
        val diffCallback = HomeItemDiffCallback(users, items)
        val diffResult = DiffUtil.calculateDiff(diffCallback)

        users.clear()
        users.addAll(items)
        diffResult.dispatchUpdatesTo(this)
    }
}

class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val binding = ItemUserBinding.bind(itemView)

    fun bindTo(user: User, viewModel: HomeViewModel) {
        binding.user = user
        binding.homeViewModel = viewModel
    }
}

class HomeItemDiffCallback(private val oldList: List<User>,
                           private val newList: List<User>) : DiffUtil.Callback() {

    override fun getOldListSize() = oldList.size

    override fun getNewListSize() = newList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int)
            = oldList[oldItemPosition] == newList[newItemPosition]

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].id == newList[newItemPosition].id
                && oldList[oldItemPosition].avatarUrl == newList[newItemPosition].avatarUrl
                && oldList[oldItemPosition].login == newList[newItemPosition].login
    }
}