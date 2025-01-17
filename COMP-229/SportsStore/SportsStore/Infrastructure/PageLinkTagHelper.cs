﻿using System.Collections.Generic;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Rendering;
using Microsoft.AspNetCore.Mvc.Routing;
using Microsoft.AspNetCore.Mvc.ViewFeatures;
using Microsoft.AspNetCore.Razor.TagHelpers;
using SportsStore.Models.ViewModels;

namespace SportsStore.Infrastructure
{
  [HtmlTargetElement("div", Attributes = "page-model")]
  public class PageLinkTagHelper : TagHelper
  {
    private IUrlHelperFactory _urlHelperFactory;

    public PageLinkTagHelper(IUrlHelperFactory helperFactory)
    {
      _urlHelperFactory = helperFactory;
    }

    [ViewContext] [HtmlAttributeNotBound] public ViewContext ViewContext { get; set; }

    public PagingInfo PageModel { get; set; }
    public string PageAction { get; set; }
    public bool PageClassEnabled { get; set; } = false;
    public string PageClass { get; set; }
    public string PageClassNormal { get; set; }
    public string PageClassSelected { get; set; }

    [HtmlAttributeName(DictionaryAttributePrefix = "page-url-")]
    public Dictionary<string, object> PageUrlValues { get; set; } = new Dictionary<string, object>();
    public override void Process(TagHelperContext context, TagHelperOutput output)
    {
      IUrlHelper urlHelper = _urlHelperFactory.GetUrlHelper(ViewContext);
      TagBuilder result = new TagBuilder("div");
      for (int i = 1; i <= PageModel.TotalPages; i++)
      {
        TagBuilder tag = new TagBuilder("a");
        tag.Attributes["href"] = urlHelper.Action(PageAction, new {productPage = i});
        if (PageClassEnabled)
        {
          tag.AddCssClass(PageClass);
          tag.AddCssClass(i == PageModel.CurrentPage ? PageClassSelected : PageClassNormal);
        }

        tag.InnerHtml.Append((i.ToString()));
        result.InnerHtml.AppendHtml(tag);
      }

      output.Content.AppendHtml(result.InnerHtml);
    }
  }
}