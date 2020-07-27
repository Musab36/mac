package com.salajim.musab.musabacademy.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.salajim.musab.musabacademy.R;
import com.salajim.musab.musabacademy.model.Signals;

import java.util.List;

public class SignalsAdapter extends RecyclerView.Adapter<SignalsAdapter.SignalsViewHolder> {
    private List<Signals> signals;
    private Context mContext;

    public SignalsAdapter(Context context, List<Signals> signals) {
        this.mContext = context;
        this.signals = signals;
    }

    @Override
    public SignalsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.signals_view, parent, false);

        return new SignalsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SignalsViewHolder holder, int position) {
        holder.bindSignals(signals.get(position));
    }

    @Override
    public int getItemCount() {
        return signals.size();
    }

    public class SignalsViewHolder extends RecyclerView.ViewHolder {
        private Context mContext;

        TextView pairs;
        TextView signal;
        TextView entry;
        TextView takeProfit;
        TextView stopLoss;

        public SignalsViewHolder(View itemView) {
            super(itemView);
            mContext = itemView.getContext();
        }

        public void bindSignals(Signals signals) {
            pairs = (TextView) itemView.findViewById(R.id.pairText);
            signal = (TextView) itemView.findViewById(R.id.signalText);
            entry = (TextView) itemView.findViewById(R.id.entryText);
            takeProfit = (TextView) itemView.findViewById(R.id.profitText);
            stopLoss = (TextView) itemView.findViewById(R.id.stopLossText);

            pairs.setText("Pair: " + signals.getPair());
            signal.setText("Signal: " + signals.getSignal());
            entry.setText("Entry: " + signals.getEntry());
            takeProfit.setText("Take Profit: " + signals.getTakeProfit());
            stopLoss.setText("Stop Loss: " + signals.getStopLoss());

        }

    }
}
