package com.maxtree.tb4beans;

import java.util.ArrayList;
import java.util.List;

public class PrintableBean {

	/**
	 * Constructor
	 */
	public PrintableBean() {
	}
	
	/**
	 * Constructor
	 * 
	 * @param PlateType
	 * @param PlateNum
	 * @param CLSBDH
	 * @param ShelvesNum
	 * @param BusType
	 * @param Index
	 * @param Code
	 * @param Owner
	 * @param IDNum
	 * @param ChineseBrand
	 * @param Color
	 * @param EngineNum
	 * @param UseOfNature
	 * @param ModelOfCar
	 * @param BusName
	 * @param Verifier
	 * @param Verifytime
	 * @param WrongContent
	 */
	public PrintableBean(String PlateType,String PlateNum,String CLSBDH,String ShelvesNum,String BusType,int Index,String Code,String Owner
			,String IDNum,String ChineseBrand, String Color, String EngineNum, String UseOfNature, String ModelOfCar, String BusName,
			String Verifier, String Verifytime,String WrongContent) {
		this.PlateType = PlateType;
		this.PlateNum = PlateNum;
		this.CLSBDH = CLSBDH;
		this.ShelvesNum = ShelvesNum;
		this.BusType = BusType;
		this.Index = Index;
		this.Code = Code;
		this.Owner = Owner;
		this.IDNum = IDNum;
		this.ChineseBrand = ChineseBrand;
		this.Color = Color;
		this.EngineNum = EngineNum;
		this.UseOfNature = UseOfNature;
		this.ModelOfCar = ModelOfCar;
		this.BusName = BusName;
		this.Verifier = Verifier;
		this.Verifytime = Verifytime;
		this.WrongContent = WrongContent;
	}
	
	
	public String getPlateType() {
		return PlateType;
	}

	public void setPlateType(String plateType) {
		PlateType = plateType;
	}

	public String getPlateNum() {
		return PlateNum;
	}

	public void setPlateNum(String plateNum) {
		PlateNum = plateNum;
	}

	public String getCLSBDH() {
		return CLSBDH;
	}

	public void setCLSBDH(String cLSBDH) {
		CLSBDH = cLSBDH;
	}

	public String getShelvesNum() {
		return ShelvesNum;
	}

	public void setShelvesNum(String shelvesNum) {
		ShelvesNum = shelvesNum;
	}

	public String getBusType() {
		return BusType;
	}

	public void setBusType(String busType) {
		BusType = busType;
	}

	public int getIndex() {
		return Index;
	}

	public void setIndex(int index) {
		Index = index;
	}

	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}

	public String getOwner() {
		return Owner;
	}

	public void setOwner(String owner) {
		Owner = owner;
	}

	public String getIDNum() {
		return IDNum;
	}

	public void setIDNum(String iDNum) {
		IDNum = iDNum;
	}

	public String getChineseBrand() {
		return ChineseBrand;
	}

	public void setChineseBrand(String chineseBrand) {
		ChineseBrand = chineseBrand;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getEngineNum() {
		return EngineNum;
	}

	public void setEngineNum(String engineNum) {
		EngineNum = engineNum;
	}

	public String getUseOfNature() {
		return UseOfNature;
	}

	public void setUseOfNature(String useOfNature) {
		UseOfNature = useOfNature;
	}

	public String getModelOfCar() {
		return ModelOfCar;
	}

	public void setModelOfCar(String modelOfCar) {
		ModelOfCar = modelOfCar;
	}

	public String getBusName() {
		return BusName;
	}

	public void setBusName(String busName) {
		BusName = busName;
	}

	public String getVerifier() {
		return Verifier;
	}

	public void setVerifier(String verifier) {
		Verifier = verifier;
	}

	public String getVerifytime() {
		return Verifytime;
	}

	public void setVerifytime(String verifytime) {
		Verifytime = verifytime;
	}

	public String getWrongContent() {
		return WrongContent;
	}

	public void setWrongContent(String wrongContent) {
		WrongContent = wrongContent;
	}

	public static List<PrintableBean> createBeanCollection() {
		List<PrintableBean> list = new ArrayList<PrintableBean>();
		PrintableBean bean = new PrintableBean("小型汽车","辽BB8K57","5692","001-001-001-001","新车注册",1,"44567788",
				"陈顺谊","2102121211212","北汽","基金色","AF0492","家用","E130","新车注册","鲁智深","2018年12月29日","车辆照片不清晰。");
		list.add(bean);
		return list;
	}
	
	private String PlateType; // 号牌种类
	private String PlateNum; // 号码号牌
	private String CLSBDH; // 车辆识别代号
	private String ShelvesNum;//上架编号
	private String BusType;// 业务类型
	private int Index;//索引号
	private String Code;//流水号
	private String Owner;//所有人
	private String IDNum;//证件号码
	private String ChineseBrand;//中文品牌
	private String Color;// 车身颜色
	private String EngineNum;//发动机号码
	private String UseOfNature;//使用性质
	private String ModelOfCar;//车辆型号
	private String BusName;//业务名称
	private String Verifier;//审核人
	private String Verifytime;//审核时间
	private String WrongContent;//错误内容
	
}
