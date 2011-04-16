package PackageListaProdutoPreco;

public class ListaProdutosProxy implements PackageListaProdutoPreco.ListaProdutos {
  private String _endpoint = null;
  private PackageListaProdutoPreco.ListaProdutos listaProdutos = null;
  
  public ListaProdutosProxy() {
    _initListaProdutosProxy();
  }
  
  public ListaProdutosProxy(String endpoint) {
    _endpoint = endpoint;
    _initListaProdutosProxy();
  }
  
  private void _initListaProdutosProxy() {
    try {
      listaProdutos = (new PackageListaProdutoPreco.ListaProdutosServiceLocator()).getListaProdutos();
      if (listaProdutos != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)listaProdutos)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)listaProdutos)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (listaProdutos != null)
      ((javax.xml.rpc.Stub)listaProdutos)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public PackageListaProdutoPreco.ListaProdutos getListaProdutos() {
    if (listaProdutos == null)
      _initListaProdutosProxy();
    return listaProdutos;
  }
  
  public PackageListaProdutoPreco.Produto[] listarProdutos() throws java.rmi.RemoteException{
    if (listaProdutos == null)
      _initListaProdutosProxy();
    return listaProdutos.listarProdutos();
  }
  
  
}