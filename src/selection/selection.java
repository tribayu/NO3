package selection;

public class selection {
    private String[] data;
    public void setData(String[] data) {
        this.data = data;
    }
    public void sort() {

        int i, j, counter_i;
        String small;
        int n = this.data.length;
        for (i= 0; i < n - 1; i++){
            counter_i = i;

            for (j = i + 1; j < n;j++) {
                if (this.data[j]
                        .compareTo(this.data[counter_i]) < 0){
                    {
                        small = this.data[j];

                        String temp = this.data[j];
                        this.data[j] = this.data[i];
                        this.data[i] = temp;
                    }
                }
            }
        }

    }
    public void Printsort(){
        for (int i=0; i<this.data.length;i++){
            System.out.println(this.data[i]+"");
        }
    }

    public static void main(String[] args) {
        String[] mahasiswa = {"bayu","antii","farhan","oki","satria",};
        selection _mySN = new selection();
        _mySN.setData(mahasiswa);
        _mySN.sort();
        _mySN.Printsort();
    }
}
