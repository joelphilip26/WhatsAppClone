package com.jithinjude.whatsappclone;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.net.URL;
import java.util.List;

/**
 * Created by <Jithin/Jude> on 22,August,2019.
 * jithin.jude68@gmail.com
 */
public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ChatViewHolder> {
    private List<ChatModel> chatList;


    
    public class ChatViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewName;
        private TextView textViewMessage;
        private TextView textViewTime;
        private ImageView imageViewProfilePic;
        private ChatViewHolder(View view) {
            super(view);
            textViewName = view.findViewById(R.id.tv_name);
            textViewMessage = view.findViewById(R.id.tv_message);
            textViewTime = view.findViewById(R.id.tv_time);
            imageViewProfilePic = view.findViewById(R.id.profile_image);

            try {
                URL newurl = new URL("https://www.dpsainiflorist.com/wp-content/uploads/2015/10/passion-love_1.jpg");
                Bitmap mIcon_val = BitmapFactory.decodeStream(newurl.openConnection().getInputStream());
                imageViewProfilePic.setImageBitmap(mIcon_val);
            }catch (Exception e){}
        }
    }
    
    public ChatAdapter(List<ChatModel> chatList) {
        this.chatList = chatList;
    }
    
    @Override
    public ChatAdapter.ChatViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.chat_item, parent, false);

        ChatViewHolder chatViewHolder = new ChatViewHolder(itemView);

        return chatViewHolder;
    }

    @Override
    public void onBindViewHolder(ChatViewHolder holder, int position) {
        holder.textViewName.setText(chatList.get(position).name);
        holder.textViewMessage.setText(chatList.get(position).message);
        holder.textViewTime.setText(chatList.get(position).time);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return chatList.size();
    }
}
