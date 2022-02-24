


public class Soru implements Comparable<Soru>  {

	private int id;
	private int puan;
	private int zorluk;
	private int tur;
	private String soru;
	private String cevapa;
	private String cevapb;
	private String cevapc;
	private String cevapd;
	private String dogrucevap;
	




	public Soru() 
	{
		
	}



	public int getTur() {
		return tur;
	}

	public void setTur(int tur) {
		this.tur = tur;
	}



	public Soru(int id, int puan, int zorluk, int tur, String soru) {
		super();
		this.id = id;
		this.puan = puan;
		this.zorluk = zorluk;
		this.tur = tur;
		this.soru = soru;
	}




	public Soru(int id, int puan, int zorluk, int tur, String soru, String dogrucevap) {
		super();
		this.id = id;
		this.puan = puan;
		this.zorluk = zorluk;
		this.tur = tur;
		this.soru = soru;
		this.dogrucevap = dogrucevap;
	}




	public Soru(int id, int puan, int zorluk, int tur, String soru, String cevapa, String cevapb, String cevapc,
			String cevapd, String dogrucevap) {
		super();
		this.id = id;
		this.puan = puan;
		this.zorluk = zorluk;
		this.tur = tur;
		this.soru = soru;
		this.cevapa = cevapa;
		this.cevapb = cevapb;
		this.cevapc = cevapc;
		this.cevapd = cevapd;
		this.dogrucevap = dogrucevap;
	}



	@Override
	public String toString() {
		return "Soru [id=" + id + ", puan=" + puan + ", zorluk=" + zorluk + ", tur=" + tur +", soru=" + soru + ", cevapa=" + cevapa
				+ ", cevapb=" + cevapb + ", cevapc=" + cevapc + ", cevapd=" + cevapd + ", dogrucevap=" + dogrucevap
				+ "]";
	}



	public String getCevapa() {
		return cevapa;
	}


	public void setCevapa(String cevapa) {
		this.cevapa = cevapa;
	}


	public String getCevapb() {
		return cevapb;
	}


	public void setCevapb(String cevapb) {
		this.cevapb = cevapb;
	}


	public String getCevapc() {
		return cevapc;
	}


	public void setCevapc(String cevapc) {
		this.cevapc = cevapc;
	}


	public String getCevapd() {
		return cevapd;
	}


	public void setCevapd(String cevapd) {
		this.cevapd = cevapd;
	}




	public int getPuan() {
		return puan;
	}


	public void setPuan(int puan) {
		this.puan = puan;
	}

	public int getZorluk() {
		return zorluk;
	}


	public void setZorluk(int zorluk) {
		this.zorluk = zorluk;
	}


	public String getDogrucevap() {
		return dogrucevap;
	}


	public void setDogrucevap(String dogrucevap) {
		this.dogrucevap = dogrucevap;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getSoru() {
		return soru;
	}


	public void setSoru(String soru) {
		this.soru = soru;
	}


	
	public int compareTo(Soru o) {
		if(this.puan<o.puan)return -1;
		if(this.puan>o.puan)return 1;
		
		return 0;
	}

	
	
}
