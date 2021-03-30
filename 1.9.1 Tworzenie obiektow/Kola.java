class Kola {
    private Float liczba_pi = 3.1415f;
    private int promien_kola = 0;

    public Kola(int promien_kola){
		this.promien_kola = promien_kola;
    }
    public float Pole_Kola(){
        return liczba_pi*(promien_kola*promien_kola);
    }
    public float Obwod_Kola(){
        return 2*liczba_pi*promien_kola;
	}
}
