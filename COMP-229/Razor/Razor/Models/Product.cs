using System.Xml.Serialization;

namespace Razor.Models
{
  public class Product
  {
    public int ProductID { get; set; }
    public string Name { get; set; }
    public string Descriptions { get; set; }
    public string Category { get; set; }
    public decimal Price { get; set; }
  }
}