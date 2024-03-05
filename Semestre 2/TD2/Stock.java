package td2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;

public class Stock {
	private HashSet<Article> articlesMg = new HashSet<Article>() ;
	private HashMap<String, Integer> stockMg = new HashMap<String,Integer>();
	// permet d’ajouter un nouveau article à l’ensemble
	//articlesMg et de préciser sa quantité dans la table stockMg
	public boolean addNouvArticle(Article a, int qt ){
		if(stockMg.containsKey(a.getNom()))
			return false;
		articlesMg.add(a) ;
		stockMg.put(a.getNom(), qt);
		return true;
	}
	// retourne true si le nom de l’article donné a est en vente
	//dans le magasin, false sinon
	public boolean verifArticle(String a ){
		if(stockMg.containsKey(a))
			return true;
		return false;
	}
	
	// retourne l’article correspondant au nom donné a s’il
	//existe, null sinon
	public Article getArticle(String a ){
		for (Article ar: articlesMg) {
			if(ar.getNom().equals(a)) {
				return ar;
			}
		}
		return null;
	}
	
	//supprime l’article correspondant au nom donné a de
	//articlesMg et stockMg
	public boolean removeArticle(String a ){
		if(!stockMg.containsKey(a))
			return false;
		Iterator<Article> it = articlesMg.iterator();
		while(it.hasNext()){
			if(it.next().getNom().equals(a)){
				it.remove();
				stockMg.remove(a);
				return true;
			}
		}
		return false;
	}
	public int getQt(String a){
		if(!stockMg.containsKey(a))
			return -1;
		else
			return stockMg.get(a);
	}
	//modifie la quantité en stock de l’article correspondant au nom donné a
	public Boolean changeQt(String a, int i){
		if(!stockMg.containsKey(a))
			return false;
		int qt =stockMg.get(a);
		qt = qt +i;
		if(qt<0)
			return false;
		else
			stockMg.put(a, qt);
		return true ; 
	}
	
	//afficher le stock (stockMg) trié selon l’ordre
	//alphabétique des noms des articles.
	public void sortStock( ){
		TreeMap<String, Integer> sortedStock = new TreeMap<>(stockMg);
		System.out.println("====================");
		for(String a : sortedStock.keySet()) {
			System.out.println(a+" : "+sortedStock.get(a));
		}
	}
}