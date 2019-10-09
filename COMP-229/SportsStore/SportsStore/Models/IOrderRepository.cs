using System.Linq;

namespace SportsStore.Models
{
  public abstract class IOrderRepository
  {
    IQueryable<Order> Orders { get; }
    internal abstract void SaveOrder(Order order);
  }
}