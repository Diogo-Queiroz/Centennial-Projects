﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Builder;
using Microsoft.AspNetCore.Hosting;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Routing;
using Microsoft.CodeAnalysis;
using Microsoft.Extensions.DependencyInjection;
using Microsoft.EntityFrameworkCore;
using Microsoft.Extensions.Configuration;
using Microsoft.Extensions.Options;
using SportsStore.Models;

namespace SportsStore
{
  public class Startup
  {
    public Startup(IConfiguration configuration) => Configuration = configuration;

    public IConfiguration Configuration { get; }
    // This method gets called by the runtime. Use this method to add services to the container.
    // For more information on how to configure your application, visit https://go.microsoft.com/fwlink/?LinkID=398940
    public void ConfigureServices(IServiceCollection services)
    {
      services.AddDbContext<ApplicationDbContext>(Options =>
        Options.UseSqlServer(Configuration["Data:SportStoreProducts:ConnectionString"])
      );
      //services.AddTransient<IProductRepository, FakeProductRepository>();
      services.AddTransient<IProductRepository, EFProductRepository>();
      services.AddMvc();
    }

    // This method gets called by the runtime. Use this method to configure the HTTP request pipeline.
    public void Configure(IApplicationBuilder app, IHostingEnvironment env, ApplicationDbContext dbContext)
    {
      if (env.IsDevelopment())
      {
        app.UseDeveloperExceptionPage();
      }

      app.UseDeveloperExceptionPage();
      app.UseStaticFiles();
      app.UseStatusCodePages();
      app.UseMvc(
        routes =>
        {
          routes.MapRoute(
            name: null,
            template: "{category}/Page{productPage:int}",
            defaults: new {Controller = "Product", action = "List"}
          );
          routes.MapRoute(
            name: null,
            template: "Page{productPage:int}",
            defaults: new {Controller = "Product", action = "List", productPage = 1}
          );
          routes.MapRoute(
            name: null,
            template: "{category}",
            defaults: new {Controller = "Product", action = "List", productPage = 1}
          );
          routes.MapRoute(
            name: "pagination",
            template: "Products/Page{productPage}",
            defaults: new {Controller = "Product", action = "List"}
          );
          routes.MapRoute(
            name: null,
            template: "",
            defaults: new {Controller = "Product", action = "List", productPage = 1}
          );
          routes.MapRoute(
            name: "default",
            template: "{controller}/{action}/{id?}");
        }
      );
      SeedData.EnsurePopulated(app);
    }
  }
}