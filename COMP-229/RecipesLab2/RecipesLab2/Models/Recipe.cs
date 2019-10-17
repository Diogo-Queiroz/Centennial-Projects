using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace RecipesLab2.Models
{
  public class Recipe
  {
    public int RecipeID { get; set; }
    [Required(ErrorMessage = "Please provide a name for the Recipe")]
    public string Name { get; set; }
    [Required(ErrorMessage = "Please enter the Ingredients")]
    public string Ingredients { get; set; }
    [Required(ErrorMessage = "Please enter the steps")]
    public string Steps { get; set; }
    [Required(ErrorMessage = "Please enter the amount of Serves")]
    public int qtdOfServes { get; set; }
    [Required(ErrorMessage = "Please enter the time to prepare")]
    public int timeToPrepare { get; set; }
    [Required(ErrorMessage = "Please enter the Description")]
    public string Description { get; set; }
  }
}
