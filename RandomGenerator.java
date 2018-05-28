package deneme;
class RastgeleKarakter 
{
    
    private int rastgele;

        private long msuan() //Nanosaniye cinsinden tarihi döndürür.
        {
            long suan;
            suan=System.nanoTime();
            return suan;

        }
        
        public char rast() //rastgele karakter ascii den yararlanarak.
        {
            char b;
            
            while(true)
            {
                rastgele=(int)((msuan())%123);
                if((rastgele>=65 && rastgele<=90) || (rastgele>=97 && rastgele<=122))
                    break;
            
            }
            
            
            b=(char) rastgele;
            return b;
        }
        
        
        public String rast(int adet) // adet kadar rastgele karakter
        {
            String dt="";
            for(int i=1;i<=adet;i++)
            {
                
                
                rastgele=rast();
                dt+= (char) rastgele;
            }
            return dt;
        }
        
        public char rast(int a, int b) //verilen iki karakter arasýnda.
        {
            
            do
            {
                rastgele=rast();
                if(rastgele>=a && rastgele<=b)
                    break;
            
            } while(true);
            
            return (char) rastgele;        
        
        }
        
        public String rast(int a, int b, int c) //verilen iki karakter arasýnda istenen adet kadar.
        {
            String at="";
            
            
            for(int i=1;i<=c;i++)
            {
                do
                {
                    rastgele=rast();
                    if(rastgele>=a && rastgele<=b)
                        break;

                } while(true);
            
            
                at+= (char) rastgele;
            }
            
            return at;        
        
        }

        public char rastb(int... karakterler)
        {
            
            String pt="";
            int i=0;
            
            for(int a=0;a<karakterler.length;a++)
            {
                pt+=(char) karakterler[a]; 
                i++;
            }
            
            
            rastgele=(int) ((msuan())%i); //gelen toplam parametre sayýsýna bölümünden kalana göre rastgele sayý üretildi.
 
            return pt.charAt(rastgele);

        }
        
        public String rastab(int t,int... karakterler)
        {
            
            String ct="";
            String xt="";
            
            int i=0;
            
            for(int x=0;x<t;x++)
            {
            
                for(int a=0;a<karakterler.length;a++)
                {
                    xt+=(char) karakterler[a]; 
                    i++;
                }
 
            rastgele=(int) ((msuan())%i); //gelen toplam parametre sayýsýna bölümünden kalana göre rastgele sayý üretildi.
            ct+=xt.charAt(rastgele);
            }

            return ct;

        }

        public String cumle(int bslk)
        {
            int bosluk;

            String cumle="";
            char cumle2[]=null;

            for(int i=0;i<bslk+35;i++)
            {
                
                cumle+= rast();
                
                
            }
            
            cumle2=cumle.toCharArray();
  
            for(int i=0;i<bslk+35;i++)
            {
                
                    if(bslk!=0)
                    {
                        bosluk=(int) ((msuan())%35);
                        cumle2[bosluk]=' ';
                        bslk--;
                    }

            }
            return cumle;
         
        }
}