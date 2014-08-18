package cn.hb.hg.wx.hz.wangdaihelper.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import cn.hb.hg.wx.hz.wangdaihelper.MainActivity.PlaceholderFragment;
import cn.hb.hg.wx.hz.wangdaihelper.R;

public class ChargeFragment extends PlaceholderFragment {

	private EditText et_platformName;// ƽ̨����
	private EditText et_projectName;// Ͷ������
	private EditText et_investTime;// Ͷ��ʱ��
	private EditText et_timeLimit;// Ͷ������
	private EditText et_investMoney;// Ͷ�ʽ��
	private EditText et_interestRate;// ������
	private EditText et_investReward;// Ͷ�ʽ���
	private EditText et_platformCost;// �����
	private EditText et_otherMoney;// ��������
	private TextView tv_totalRevenue;// ������
	private TextView tv_realRate;// ����������

	private Button btn_searchPf;
	private Button btn_calculate;
	private Button btn_save;

	private RadioGroup rg_timeMethod;

	private RadioButton rb_day;
	private RadioButton rb_month;

	private Spinner sp_style;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_charge, container, false);
		findView(rootView);
		return rootView;
	}

	private void findView(View rootView) {
		et_platformName = (EditText) rootView.findViewById(R.id.et_platformName);
		et_projectName = (EditText) rootView.findViewById(R.id.et_projectName);
		et_investTime = (EditText) rootView.findViewById(R.id.et_investTime);
		et_timeLimit = (EditText) rootView.findViewById(R.id.et_timeLimit);
		et_investMoney = (EditText) rootView.findViewById(R.id.et_investMoney);

		et_interestRate = (EditText) rootView.findViewById(R.id.et_interestRate);
		et_investReward = (EditText) rootView.findViewById(R.id.et_investReward);
		et_platformCost = (EditText) rootView.findViewById(R.id.et_platformCost);
		et_otherMoney = (EditText) rootView.findViewById(R.id.et_otherMoney);
		tv_totalRevenue = (TextView) rootView.findViewById(R.id.tv_totalRevenue);
		tv_realRate = (TextView) rootView.findViewById(R.id.tv_realRate);

		btn_searchPf = (Button) rootView.findViewById(R.id.btn_searchPf);
		btn_calculate = (Button) rootView.findViewById(R.id.btn_calculate);
		btn_save = (Button) rootView.findViewById(R.id.btn_save);

		rg_timeMethod = (RadioGroup) rootView.findViewById(R.id.rg_timeMethod);
		rb_day = (RadioButton) rootView.findViewById(R.id.rb_day);
		rb_month = (RadioButton) rootView.findViewById(R.id.rb_month);
		sp_style = (Spinner) rootView.findViewById(R.id.sp_style);

	}

	private void setListener() {

	}

	private long calculateMoney(long money, long rate) {

		return 0;
	}

}
