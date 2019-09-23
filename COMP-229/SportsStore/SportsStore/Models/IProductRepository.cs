using System;
using System.Linq;
using  SportsStore.Models;

namespace SportsStore.Models
{
  public interface IProductRepository
  {
    IQueryable<Product> Products { set; get; }
  }
}