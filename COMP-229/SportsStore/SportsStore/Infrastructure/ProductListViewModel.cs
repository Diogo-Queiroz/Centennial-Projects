using System.Collections;
using System.Collections.Generic;
using SportsStore.Models;
using SportsStore.Models.ViewModels;

namespace SportsStore.Infrastructure
{
  public class ProductListViewModel
  {
    public IEnumerable<Product> Products { get; set;}
    public PagingInfo PagingInfo { get; set; }
  }
}