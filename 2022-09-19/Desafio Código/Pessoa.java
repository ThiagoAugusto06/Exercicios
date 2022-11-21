
//Classe Pessoa
//Autor: Thiago Augusto - Aula 19-09
Class Pessoa{
    String strcpf;
    String strnome;
        //Construtor
        public Pessoa(String strcpf, String strnome){
            this.strcpf = strcpf;
            this.strnome = strnome;
                }

        public void setCPF(String strcpf){
            this.strcpf = strcpf;
        }

        public void setNome(String strnome){
            this.strnome = strnome;
        }

        public String getCpf(){
            return strcpf;
        }

        public String getNome(){
            return strnome;
        }
}
