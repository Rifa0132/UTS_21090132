public class Facebook {
    
    public String icon like ;
    public int  jumlah likes;
    public String direct message ;
    public String kolom komentar ;

    public Facebook(){
    
    }

    public Facebook(String nilike, int jml like, String drmess, String klm kom){
        this.icon like = nilike;
        this.jumla likes = njml like;
        this.Katagori direct message = ndrmess;
        this.kolom komentar = klm kom;
    }

    public String geticon like(){
        return this.icon like;
     }
     public void seticon like(String icon like){
          this.iconlike = icon like;
     }
}
