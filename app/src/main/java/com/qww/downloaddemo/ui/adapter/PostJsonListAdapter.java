package com.qww.downloaddemo.ui.adapter;

import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.qww.downloaddemo.R;
import com.qww.downloaddemo.model.domain.PostWithParamsResult.ShowapiResBodyBean.PagebeanBean;
import com.qww.downloaddemo.model.domain.PostWithParamsResult.ShowapiResBodyBean.PagebeanBean.ContentlistBean;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class PostJsonListAdapter extends RecyclerView.Adapter<PostJsonListAdapter.InnerHolder> {

    private List<ContentlistBean> data = new ArrayList<>();

    @NonNull
    @Override
    public InnerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.result_item, parent, false);
        return new InnerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull InnerHolder holder, int position) {
        //绑定数据
        View itemView = holder.itemView;
        ImageView head = itemView.findViewById(R.id.head);
        TextView username = itemView.findViewById(R.id.username);
        TextView time = itemView.findViewById(R.id.time);
        TextView location = itemView.findViewById(R.id.location);
        TextView description = itemView.findViewById(R.id.description);
        RecyclerView imgs = itemView.findViewById(R.id.imgs);
        GridLayoutManager manager = new GridLayoutManager(itemView.getContext(), 3);
        imgs.setLayoutManager(manager);

        //设置数据
        ContentlistBean contentlistBean = data.get(position);
        Log.d("PostJsonListAdapter", contentlistBean.toString());
        Picasso.get()
                .load(contentlistBean.getAvatarUrl())
                .placeholder(R.drawable.loading)
                .into(head);
        username.setText(contentlistBean.getRealName());
        time.setText("身高:" + contentlistBean.getHeight());
        location.setText(contentlistBean.getCity());
        description.setText("体重:" + contentlistBean.getWeight() + "粉丝数" + contentlistBean.getTotalFanNum());
        if (imgs.getAdapter() == null) {
            imgs.setAdapter(new ImgsAdapter(contentlistBean));
        }

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class InnerHolder extends RecyclerView.ViewHolder {
        public InnerHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    public void setData(PagebeanBean pagebeanBean) {
        data.clear();
        data.addAll(pagebeanBean.getContentlist());
        notifyDataSetChanged();
    }

    class ImgsAdapter extends RecyclerView.Adapter<ImgsAdapter.VH> {

        private ContentlistBean contentlistBean;
        public ImgsAdapter(ContentlistBean contentlistBean) {
            this.contentlistBean = contentlistBean;
        }

        @NonNull
        @Override
        public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.imgs_item, parent, false);
            return new VH(view);
        }

        @Override
        public void onBindViewHolder(@NonNull VH holder, int position) {
            View itemView = holder.itemView;
            ImageView img = itemView.findViewById(R.id.img);

            if (TextUtils.isEmpty(contentlistBean.getImgList().get(position))) {
                Picasso.get()
                        .load(R.mipmap.ic_launcher)
                        .into(img);
            }
            Picasso.get()
                    .load(contentlistBean.getImgList().get(position))
                    .resize(100, 100)
                    .centerInside()
                    .placeholder(R.drawable.loading)
                    .error(R.drawable.ic_error)
                    .into(img);
        }

        @Override
        public int getItemCount() {
            return contentlistBean.getImgList().size();
        }

        public class VH extends RecyclerView.ViewHolder {
            public VH(@NonNull View itemView) {
                super(itemView);
            }
        }
    }
}
