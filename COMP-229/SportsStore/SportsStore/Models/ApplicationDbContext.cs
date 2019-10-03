using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.Design;
using Microsoft.EntityFrameworkCore.Infrastructure;
using Microsoft.Extensions.DependencyInjection;

namespace SportsStore.Models
{
  public partial class ApplicationDbContext : DbContext
  {
    public ApplicationDbContext(DbContextOptions<ApplicationDbContext> options) 
      : base(options)
    {
    }
    
    public DbSet<Product> Products { get; set; }
  }

  public class ApplicationDbContextFactory
    : IDesignTimeDbContextFactory<ApplicationDbContext>
  {
    public ApplicationDbContext CreateDbContext(string[] args)
    {
      //Program.CreateWebHostBuilder(args).ConfigureServices.GetRequiredService<ApplicationDbContext>();
      Program.CreateWebHostBuilder(args).Build().Services.GetRequiredService<ApplicationDbContext>();
      return null;
    }
  }
}