package PackageListaProdutoPreco;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ListaProdutos {

	Produto[] todosProdutos;
	FileReader arquivo;
	String strLinha;
	
	public ListaProdutos(){
		
		try {
		
			List<Produto> listaTemp = new ArrayList<Produto>();
			arquivo = new FileReader("../../ProdutosLoja.txt");
			
			
			BufferedReader in = new BufferedReader(arquivo);
			strLinha = in.readLine();

			while(strLinha != null){
				
				String[] dadosProduto = strLinha.split(" ");
				
				Produto produto = new Produto();
				produto.setNome(dadosProduto[0]);
				produto.setPreco(Double.parseDouble(dadosProduto[1]));
				produto.setPeso(Double.parseDouble(dadosProduto[2]));
				produto.setComprimento(Double.parseDouble(dadosProduto[3]));
				produto.setAltura(Double.parseDouble(dadosProduto[4]));
				produto.setLargura(Double.parseDouble(dadosProduto[5]));
				produto.setDiametro(Double.parseDouble(dadosProduto[6]));
				
				listaTemp.add(produto);
			
				strLinha = in.readLine();
			}
			
			in.close();
			arquivo.close();
			
			this.todosProdutos = new Produto[listaTemp.size()];
			int i = 0;
			for(Produto p : listaTemp){
				this.todosProdutos[i] = p;
				i++;
			}
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//arquivo = new FileReader(new File("/WebServiceListarProdutos/ArquivosExternos/ProdutosLoja.txt"));
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//strLinha = in.readLine();
			e.printStackTrace();
		}
		
	}
	
	public Produto[] listarProdutos(){
		
		return todosProdutos;
	}
	
	
}
