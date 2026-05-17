# SI_2026_lab2_243052

Давид Митков
243052
Cekor 3 Ciklicna vrednost ja presmetav so formulata V(G) = P + 1, deka so P e brojo na jazli so se if for while uslovi. Za searchBokkbyTitle toa se: if (title.isEmpty()), for (Book book : books), if (condition1 && condition2), if (results.isEmpty()).Znaci V(G) = 4+1 = 5, 
---Za da se ispolnat site naredbi potrebni se 3 test cases(every statement Criteria searchBookByTitle
1: Prazen naslov: Aktivira if (title.isEmpty()).
2: Pronajdena kniga: Izvrsuva results.add(book) и return results.
3: Nenajdena kniga: Aktivira if (results.isEmpty()) и vraka null.
--- Every Branch Criteria (borrowBook)
Potrebni se 4 test cases za da pominat site granki
1: Nevaliden vlez ili granka za prazen naslov ili avtor
2: Uspesno deka so grankata kade knigata e najdena i slobodna
3: Veke e iznajmena, znaci isBorrowed e true
4: Nenajdena kniga, znaci Granka deka so ciklusot zavrsuva bez rezultat
---
ZA || uslov testirame kombinacii (True, False) i (False, True) za da se potvrde deka bilo koj prazen vlez aktivira greska.
Za && uslov: testirame (True, True) da se potvrde deka i dvata uslova treba da bidat ispolneti za knigata da bvide vratena.
---
### Control Flow Graphs
### VE MOLAM PISETE MI MAIL DOKOLKU NE RABOTAT SLIKITE BIDEJKI GI IMAM CFG
#### searchBookByTitle
![CFG searchBookByTitle](cfg_search.png)

#### borrowBook
![CFG borrowBook](cfg_borrow.png)
