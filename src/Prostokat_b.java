class Prostokat_b  {
    double wys=0, szer=0;

    Prostokat_b(double wys,double szer){
        this.wys = wys;
        this.szer = szer;

    }

    double getPowierzchnia() {
        return (szer * wys);
    }


}