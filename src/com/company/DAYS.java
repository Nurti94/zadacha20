package com.company;

public enum DAYS {

     MONDAY("Duishonbu kunu Java okuim "),
     TUESDAY("Sheishenbi kunu English okuim"),
     WEDNESDAY("Sharshenbi kunu Extra sabak"),
     THURSDAY("Beishenbi kunu Soft skill okuim"),
     FRIDAY("Juma kunu Java kaitaloo"),
     SATUDAY("Ishenbi kunu uidon okuim"),
     SUNDAY("Jekshenbi kunu es alam");
    private String sabak;

    DAYS(String sabak) {
          this.sabak = sabak;


     }

     public String getSabak() {
          return sabak;
     }

     public void setSabak(String sabak) {
          this.sabak = sabak;
     }
}

