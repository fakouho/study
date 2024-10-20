<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <title>Plus Admin</title>
    <!-- plugins:css -->
    <link rel="stylesheet" href="../../../assets/vendors/mdi/css/materialdesignicons.min.css">
    <link rel="stylesheet" href="../../../assets/vendors/flag-icon-css/css/flag-icon.min.css">
    <link rel="stylesheet" href="../../../assets/vendors/css/vendor.bundle.base.css">
    <!-- endinject -->
    <!-- Plugin css for this page -->
    <!-- End Plugin css for this page -->
    <!-- inject:css -->
    <!-- endinject -->
    <!-- Layout styles -->
    <link rel="stylesheet" href="../../../assets/css/demo_2/style.css" />
    <!-- End layout styles -->
    <link rel="shortcut icon" href="../../../assets/images/favicon.png" />
  </head>
  <body>
    <div class="container-scroller">
      <!-- partial:../../partials/_horizontal-navbar.html -->
      <div class="horizontal-menu">
        <nav class="navbar top-navbar col-lg-12 col-12 p-0">
          <div class="container">
            <div class="text-center navbar-brand-wrapper d-flex align-items-center justify-content-center">
              <a class="navbar-brand brand-logo" href="../../index.jsp">
                <img src="../../../assets/images/logo.svg" alt="logo" />
                <span class="font-12 d-block font-weight-light">Responsive Dashboard </span>
              </a>
              <a class="navbar-brand brand-logo-mini" href="../../index.jsp"><img src="../../../assets/images/logo-mini.svg" alt="logo" /></a>
            </div>
            <div class="navbar-menu-wrapper d-flex align-items-center justify-content-end">
              <ul class="navbar-nav mr-lg-2">
                <li class="nav-item nav-search d-none d-lg-block">
                  <div class="input-group">
                    <div class="input-group-prepend hover-cursor" id="navbar-search-icon">
                      <span class="input-group-text" id="search">
                        <i class="mdi mdi-magnify"></i>
                      </span>
                    </div>
                    <input type="text" class="form-control" id="navbar-search-input" placeholder="Search" aria-label="search" aria-describedby="search" />
                  </div>
                </li>
              </ul>
              <ul class="navbar-nav navbar-nav-right">
                <li class="nav-item nav-profile dropdown">
                  <a class="nav-link" id="profileDropdown" href="#" data-bs-toggle="dropdown" aria-expanded="false">
                    <div class="nav-profile-img">
                      <img src="../../../assets/images/faces/face1.jpg" alt="image" />
                    </div>
                    <div class="nav-profile-text">
                      <p class="text-black font-weight-semibold m-0"> Olson jass </p>
                      <span class="font-13 online-color">online <i class="mdi mdi-chevron-down"></i></span>
                    </div>
                  </a>
                  <div class="dropdown-menu navbar-dropdown" aria-labelledby="profileDropdown">
                    <a class="dropdown-item" href="#">
                      <i class="mdi mdi-cached me-2 text-success"></i> Activity Log </a>
                    <div class="dropdown-divider"></div>
                    <a class="dropdown-item" href="#">
                      <i class="mdi mdi-logout me-2 text-primary"></i> Signout </a>
                  </div>
                </li>
              </ul>
              <button class="navbar-toggler navbar-toggler-right d-lg-none align-self-center" type="button" data-toggle="horizontal-menu-toggle">
                <span class="mdi mdi-menu"></span>
              </button>
            </div>
          </div>
        </nav>
        <nav class="bottom-navbar">
          <div class="container">
            <ul class="nav page-navigation">
              <li class="nav-item">
                <a class="nav-link" href="../../index.jsp">
                  <i class="mdi mdi-compass-outline menu-icon"></i>
                  <span class="menu-title">Dashboard</span>
                </a>
              </li>
              <li class="nav-item">
                <a href="#" class="nav-link">
                  <i class="mdi mdi-monitor-dashboard menu-icon"></i>
                  <span class="menu-title">UI Elements</span>
                  <i class="menu-arrow"></i>
                </a>
                <div class="submenu">
                  <ul class="submenu-item">
                    <li class="nav-item">
                      <a class="nav-link" href="../../pages/ui-features/buttons.jsp">Buttons</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="../../pages/ui-features/dropdowns.jsp">Dropdown</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="../../pages/ui-features/typography.jsp">Typography</a>
                    </li>
                  </ul>
                </div>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="../../pages/forms/basic_elements.jsp">
                  <i class="mdi mdi-clipboard-text menu-icon"></i>
                  <span class="menu-title">Forms</span>
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="../../pages/icons/mdi.jsp">
                  <i class="mdi mdi-contacts menu-icon"></i>
                  <span class="menu-title">Icons</span>
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="../../pages/charts/chartjs.jsp">
                  <i class="mdi mdi-chart-bar menu-icon"></i>
                  <span class="menu-title">Charts</span>
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="../../pages/tables/basic-table.jsp">
                  <i class="mdi mdi-table-large menu-icon"></i>
                  <span class="menu-title">Tables</span>
                </a>
              </li>
              <li class="nav-item">
                <a href="https://www.bootstrapdash.com/demo/plus-free/documentation/documentation.html" class="nav-link" target="_blank">
                  <i class="mdi mdi-file-document-box menu-icon"></i>
                  <span class="menu-title">Docs</span></a>
              </li>
              <li class="nav-item">
                <div class="nav-link d-flex">
                  <button class="btn btn-sm bg-danger text-white"> Trailing </button>
                  <div class="nav-item dropdown">
                    <a class="nav-link count-indicator dropdown-toggle text-white font-weight-semibold" id="notificationDropdown" href="#" data-bs-toggle="dropdown"> English </a>
                    <div class="dropdown-menu dropdown-menu-right navbar-dropdown preview-list" aria-labelledby="notificationDropdown">
                      <a class="dropdown-item" href="#">
                        <i class="flag-icon flag-icon-bl me-3"></i> French </a>
                      <div class="dropdown-divider"></div>
                      <a class="dropdown-item" href="#">
                        <i class="flag-icon flag-icon-cn me-3"></i> Chinese </a>
                      <div class="dropdown-divider"></div>
                      <a class="dropdown-item" href="#">
                        <i class="flag-icon flag-icon-de me-3"></i> German </a>
                      <div class="dropdown-divider"></div>
                      <a class="dropdown-item" href="#">
                        <i class="flag-icon flag-icon-ru me-3"></i>Russian </a>
                    </div>
                  </div>
                  <a class="text-white" href="../../index.jsp"><i class="mdi mdi-home-circle"></i></a>
                </div>
              </li>
            </ul>
          </div>
        </nav>
      </div>
      <!-- partial -->
      <div class="container-fluid page-body-wrapper">
        <div class="main-panel">
          <div class="content-wrapper">
            <div class="page-header">
              <h3 class="page-title">Dropdowns</h3>
              <nav aria-label="breadcrumb">
                <ol class="breadcrumb">
                  <li class="breadcrumb-item"><a href="#">UI Elements</a></li>
                  <li class="breadcrumb-item active" aria-current="page"> Dropdowns </li>
                </ol>
              </nav>
            </div>
            <div class="row">
              <div class="col-lg-12 grid-margin">
                <div class="card">
                  <div class="card-body">
                    <h4 class="card-title">Gradient Dropdown</h4>
                    <p class="card-description"> Add class <code>.btn-{color}</code> to the button inside <code>.dropdown</code>
                    </p>
                    <div class="template-demo">
                      <div class="dropdown">
                        <button class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuOutlineButton1" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> Dropdown </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuOutlineButton1">
                          <h6 class="dropdown-header">Settings</h6>
                          <a class="dropdown-item" href="#">Action</a>
                          <a class="dropdown-item" href="#">Another action</a>
                          <a class="dropdown-item" href="#">Something else here</a>
                          <div class="dropdown-divider"></div>
                          <a class="dropdown-item" href="#">Separated link</a>
                        </div>
                      </div>
                      <div class="dropdown">
                        <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuOutlineButton2" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> Dropdown </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuOutlineButton2">
                          <h6 class="dropdown-header">Settings</h6>
                          <a class="dropdown-item" href="#">Action</a>
                          <a class="dropdown-item" href="#">Another action</a>
                          <a class="dropdown-item" href="#">Something else here</a>
                          <div class="dropdown-divider"></div>
                          <a class="dropdown-item" href="#">Separated link</a>
                        </div>
                      </div>
                      <div class="dropdown">
                        <button class="btn btn-danger dropdown-toggle" type="button" id="dropdownMenuOutlineButton3" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> Dropdown </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuOutlineButton3">
                          <h6 class="dropdown-header">Settings</h6>
                          <a class="dropdown-item" href="#">Action</a>
                          <a class="dropdown-item" href="#">Another action</a>
                          <a class="dropdown-item" href="#">Something else here</a>
                          <div class="dropdown-divider"></div>
                          <a class="dropdown-item" href="#">Separated link</a>
                        </div>
                      </div>
                      <div class="dropdown">
                        <button class="btn btn-warning dropdown-toggle" type="button" id="dropdownMenuOutlineButton4" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> Dropdown </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuOutlineButton4">
                          <h6 class="dropdown-header">Settings</h6>
                          <a class="dropdown-item" href="#">Action</a>
                          <a class="dropdown-item" href="#">Another action</a>
                          <a class="dropdown-item" href="#">Something else here</a>
                          <div class="dropdown-divider"></div>
                          <a class="dropdown-item" href="#">Separated link</a>
                        </div>
                      </div>
                      <div class="dropdown">
                        <button class="btn btn-success dropdown-toggle" type="button" id="dropdownMenuOutlineButton5" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> Dropdown </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuOutlineButton5">
                          <h6 class="dropdown-header">Settings</h6>
                          <a class="dropdown-item" href="#">Action</a>
                          <a class="dropdown-item" href="#">Another action</a>
                          <a class="dropdown-item" href="#">Something else here</a>
                          <div class="dropdown-divider"></div>
                          <a class="dropdown-item" href="#">Separated link</a>
                        </div>
                      </div>
                      <div class="dropdown">
                        <button class="btn btn-info dropdown-toggle" type="button" id="dropdownMenuOutlineButton6" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> Dropdown </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuOutlineButton6">
                          <h6 class="dropdown-header">Settings</h6>
                          <a class="dropdown-item" href="#">Action</a>
                          <a class="dropdown-item" href="#">Another action</a>
                          <a class="dropdown-item" href="#">Something else here</a>
                          <div class="dropdown-divider"></div>
                          <a class="dropdown-item" href="#">Separated link</a>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div class="card-body">
                    <h4 class="card-title">Basic dropdown</h4>
                    <p class="card-description"> Wrap the dropdown’s toggle (your button or link) and the dropdown menu within <code>.dropdown</code>
                    </p>
                    <div class="template-demo">
                      <div class="dropdown">
                        <button class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> Dropdown </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
                          <h6 class="dropdown-header">Settings</h6>
                          <a class="dropdown-item" href="#">Action</a>
                          <a class="dropdown-item" href="#">Another action</a>
                          <a class="dropdown-item" href="#">Something else here</a>
                          <div class="dropdown-divider"></div>
                          <a class="dropdown-item" href="#">Separated link</a>
                        </div>
                      </div>
                      <div class="dropdown">
                        <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton2" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> Dropdown </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuButton2">
                          <h6 class="dropdown-header">Settings</h6>
                          <a class="dropdown-item" href="#">Action</a>
                          <a class="dropdown-item" href="#">Another action</a>
                          <a class="dropdown-item" href="#">Something else here</a>
                          <div class="dropdown-divider"></div>
                          <a class="dropdown-item" href="#">Separated link</a>
                        </div>
                      </div>
                      <div class="dropdown">
                        <button class="btn btn-danger dropdown-toggle" type="button" id="dropdownMenuButton3" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> Dropdown </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuButton3">
                          <h6 class="dropdown-header">Settings</h6>
                          <a class="dropdown-item" href="#">Action</a>
                          <a class="dropdown-item" href="#">Another action</a>
                          <a class="dropdown-item" href="#">Something else here</a>
                          <div class="dropdown-divider"></div>
                          <a class="dropdown-item" href="#">Separated link</a>
                        </div>
                      </div>
                      <div class="dropdown">
                        <button class="btn btn-warning dropdown-toggle" type="button" id="dropdownMenuButton4" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> Dropdown </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuButton4">
                          <h6 class="dropdown-header">Settings</h6>
                          <a class="dropdown-item" href="#">Action</a>
                          <a class="dropdown-item" href="#">Another action</a>
                          <a class="dropdown-item" href="#">Something else here</a>
                          <div class="dropdown-divider"></div>
                          <a class="dropdown-item" href="#">Separated link</a>
                        </div>
                      </div>
                      <div class="dropdown">
                        <button class="btn btn-success dropdown-toggle" type="button" id="dropdownMenuButton5" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> Dropdown </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuButton5">
                          <h6 class="dropdown-header">Settings</h6>
                          <a class="dropdown-item" href="#">Action</a>
                          <a class="dropdown-item" href="#">Another action</a>
                          <a class="dropdown-item" href="#">Something else here</a>
                          <div class="dropdown-divider"></div>
                          <a class="dropdown-item" href="#">Separated link</a>
                        </div>
                      </div>
                      <div class="dropdown">
                        <button class="btn btn-info dropdown-toggle" type="button" id="dropdownMenuButton6" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> Dropdown </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuButton6">
                          <h6 class="dropdown-header">Settings</h6>
                          <a class="dropdown-item" href="#">Action</a>
                          <a class="dropdown-item" href="#">Another action</a>
                          <a class="dropdown-item" href="#">Something else here</a>
                          <div class="dropdown-divider"></div>
                          <a class="dropdown-item" href="#">Separated link</a>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div class="card-body">
                    <h4 class="card-title">Dropdown outline</h4>
                    <p class="card-description"> Add class <code>.btn-outline-{color}</code> to the button inside <code>.dropdown</code>
                    </p>
                    <div class="template-demo">
                      <div class="dropdown">
                        <button class="btn btn-outline-primary dropdown-toggle" type="button" id="dropdownMenuOutlineButton1" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> Dropdown </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuOutlineButton1">
                          <h6 class="dropdown-header">Settings</h6>
                          <a class="dropdown-item" href="#">Action</a>
                          <a class="dropdown-item" href="#">Another action</a>
                          <a class="dropdown-item" href="#">Something else here</a>
                          <div class="dropdown-divider"></div>
                          <a class="dropdown-item" href="#">Separated link</a>
                        </div>
                      </div>
                      <div class="dropdown">
                        <button class="btn btn-outline-secondary dropdown-toggle" type="button" id="dropdownMenuOutlineButton2" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> Dropdown </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuOutlineButton2">
                          <h6 class="dropdown-header">Settings</h6>
                          <a class="dropdown-item" href="#">Action</a>
                          <a class="dropdown-item" href="#">Another action</a>
                          <a class="dropdown-item" href="#">Something else here</a>
                          <div class="dropdown-divider"></div>
                          <a class="dropdown-item" href="#">Separated link</a>
                        </div>
                      </div>
                      <div class="dropdown">
                        <button class="btn btn-outline-danger dropdown-toggle" type="button" id="dropdownMenuOutlineButton3" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> Dropdown </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuOutlineButton3">
                          <h6 class="dropdown-header">Settings</h6>
                          <a class="dropdown-item" href="#">Action</a>
                          <a class="dropdown-item" href="#">Another action</a>
                          <a class="dropdown-item" href="#">Something else here</a>
                          <div class="dropdown-divider"></div>
                          <a class="dropdown-item" href="#">Separated link</a>
                        </div>
                      </div>
                      <div class="dropdown">
                        <button class="btn btn-outline-warning dropdown-toggle" type="button" id="dropdownMenuOutlineButton4" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> Dropdown </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuOutlineButton4">
                          <h6 class="dropdown-header">Settings</h6>
                          <a class="dropdown-item" href="#">Action</a>
                          <a class="dropdown-item" href="#">Another action</a>
                          <a class="dropdown-item" href="#">Something else here</a>
                          <div class="dropdown-divider"></div>
                          <a class="dropdown-item" href="#">Separated link</a>
                        </div>
                      </div>
                      <div class="dropdown">
                        <button class="btn btn-outline-success dropdown-toggle" type="button" id="dropdownMenuOutlineButton5" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> Dropdown </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuOutlineButton5">
                          <h6 class="dropdown-header">Settings</h6>
                          <a class="dropdown-item" href="#">Action</a>
                          <a class="dropdown-item" href="#">Another action</a>
                          <a class="dropdown-item" href="#">Something else here</a>
                          <div class="dropdown-divider"></div>
                          <a class="dropdown-item" href="#">Separated link</a>
                        </div>
                      </div>
                      <div class="dropdown">
                        <button class="btn btn-outline-info dropdown-toggle" type="button" id="dropdownMenuOutlineButton6" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> Dropdown </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuOutlineButton6">
                          <h6 class="dropdown-header">Settings</h6>
                          <a class="dropdown-item" href="#">Action</a>
                          <a class="dropdown-item" href="#">Another action</a>
                          <a class="dropdown-item" href="#">Something else here</a>
                          <div class="dropdown-divider"></div>
                          <a class="dropdown-item" href="#">Separated link</a>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
              <div class="row">
                <div class="col-lg-12 grid-margin">
                  <div class="card">
                    <div class="card-body">
                      <h4 class="card-title">Dropdown menu</h4>
                      <div class="row">
                        <div class="col-md-3 dropdown-menu-static-demo">
                          <div class="dropdown">
                            <button class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuOutlineButton1" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="true"> Dropdown </button>
                            <div class="dropdown-menu show" aria-labelledby="dropdownMenuOutlineButton1">
                              <h6 class="dropdown-header">Settings</h6>
                              <a class="dropdown-item" href="#">Action</a>
                              <a class="dropdown-item" href="#">Another action</a>
                              <a class="dropdown-item" href="#">Something else here</a>
                              <div class="dropdown-divider"></div>
                              <a class="dropdown-item" href="#">Separated link</a>
                            </div>
                          </div>
                        </div>
                        <div class="col-md-3 dropdown-menu-static-demo">
                          <div class="dropdown">
                            <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuOutlineButton2" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="true"> Dropdown </button>
                            <div class="dropdown-menu show" aria-labelledby="dropdownMenuOutlineButton2">
                              <h6 class="dropdown-header">Settings</h6>
                              <a class="dropdown-item" href="#">Action</a>
                              <a class="dropdown-item" href="#">Another action</a>
                              <a class="dropdown-item" href="#">Something else here</a>
                              <div class="dropdown-divider"></div>
                              <a class="dropdown-item" href="#">Separated link</a>
                            </div>
                          </div>
                        </div>
                        <div class="col-md-3 dropdown-menu-static-demo">
                          <div class="dropdown">
                            <button class="btn btn-danger dropdown-toggle" type="button" id="dropdownMenuOutlineButton3" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="true"> Dropdown </button>
                            <div class="dropdown-menu show" aria-labelledby="dropdownMenuOutlineButton3">
                              <h6 class="dropdown-header">Settings</h6>
                              <a class="dropdown-item" href="#">Action</a>
                              <a class="dropdown-item" href="#">Another action</a>
                              <a class="dropdown-item" href="#">Something else here</a>
                              <div class="dropdown-divider"></div>
                              <a class="dropdown-item" href="#">Separated link</a>
                            </div>
                          </div>
                        </div>
                        <div class="col-md-3 dropdown-menu-static-demo">
                          <div class="dropdown">
                            <button class="btn btn-warning dropdown-toggle" type="button" id="dropdownMenuOutlineButton4" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="true"> Dropdown </button>
                            <div class="dropdown-menu show" aria-labelledby="dropdownMenuOutlineButton4">
                              <h6 class="dropdown-header">Settings</h6>
                              <a class="dropdown-item" href="#">Action</a>
                              <a class="dropdown-item" href="#">Another action</a>
                              <a class="dropdown-item" href="#">Something else here</a>
                              <div class="dropdown-divider"></div>
                              <a class="dropdown-item" href="#">Separated link</a>
                            </div>
                          </div>
                        </div>
                        <div class="col-md-3 dropdown-menu-static-demo">
                          <div class="dropdown">
                            <button class="btn btn-light dropdown-toggle" type="button" id="dropdownMenuOutlineButton8" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="true"> Dropdown </button>
                            <div class="dropdown-menu show" aria-labelledby="dropdownMenuOutlineButton8">
                              <h6 class="dropdown-header">Settings</h6>
                              <a class="dropdown-item" href="#">Action</a>
                              <a class="dropdown-item" href="#">Another action</a>
                              <a class="dropdown-item" href="#">Something else here</a>
                              <div class="dropdown-divider"></div>
                              <a class="dropdown-item" href="#">Separated link</a>
                            </div>
                          </div>
                        </div>
                        <div class="col-md-3 dropdown-menu-static-demo">
                          <div class="dropdown">
                            <button class="btn btn-success dropdown-toggle" type="button" id="dropdownMenuOutlineButton5" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="true"> Dropdown </button>
                            <div class="dropdown-menu show" aria-labelledby="dropdownMenuOutlineButton5">
                              <h6 class="dropdown-header">Settings</h6>
                              <a class="dropdown-item" href="#">Action</a>
                              <a class="dropdown-item" href="#">Another action</a>
                              <a class="dropdown-item" href="#">Something else here</a>
                              <div class="dropdown-divider"></div>
                              <a class="dropdown-item" href="#">Separated link</a>
                            </div>
                          </div>
                        </div>
                        <div class="col-md-3 dropdown-menu-static-demo">
                          <div class="dropdown">
                            <button class="btn btn-info dropdown-toggle" type="button" id="dropdownMenuOutlineButton6" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="true"> Dropdown </button>
                            <div class="dropdown-menu show" aria-labelledby="dropdownMenuOutlineButton6">
                              <h6 class="dropdown-header">Settings</h6>
                              <a class="dropdown-item" href="#">Action</a>
                              <a class="dropdown-item" href="#">Another action</a>
                              <a class="dropdown-item" href="#">Something else here</a>
                              <div class="dropdown-divider"></div>
                              <a class="dropdown-item" href="#">Separated link</a>
                            </div>
                          </div>
                        </div>
                        <div class="col-md-3 dropdown-menu-static-demo">
                          <div class="dropdown">
                            <button class="btn btn-dark dropdown-toggle" type="button" id="dropdownMenuOutlineButton7" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="true"> Dropdown </button>
                            <div class="dropdown-menu show" aria-labelledby="dropdownMenuOutlineButton7">
                              <h6 class="dropdown-header">Settings</h6>
                              <a class="dropdown-item" href="#">Action</a>
                              <a class="dropdown-item" href="#">Another action</a>
                              <a class="dropdown-item" href="#">Something else here</a>
                              <div class="dropdown-divider"></div>
                              <a class="dropdown-item" href="#">Separated link</a>
                            </div>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
              <div class="col-md-6 grid-margin stretch-card">
                <div class="card">
                  <div class="card-body">
                    <h4 class="card-title">Split button dropdowns</h4>
                    <p class="card-description"> Wrap two buttons in <code>.btn-group</code> and add <code>.dropdown-toggle-split</code> to the toggling button </p>
                    <div class="template-demo">
                      <div class="btn-group">
                        <button type="button" class="btn btn-primary"> Dropdown </button>
                        <button type="button" class="btn btn-primary dropdown-toggle dropdown-toggle-split" id="dropdownMenuSplitButton1" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuSplitButton1">
                          <h6 class="dropdown-header">Settings</h6>
                          <a class="dropdown-item" href="#">Action</a>
                          <a class="dropdown-item" href="#">Another action</a>
                          <a class="dropdown-item" href="#">Something else here</a>
                          <div class="dropdown-divider"></div>
                          <a class="dropdown-item" href="#">Separated link</a>
                        </div>
                      </div>
                      <div class="btn-group">
                        <button type="button" class="btn btn-danger"> Dropdown </button>
                        <button type="button" class="btn btn-danger dropdown-toggle dropdown-toggle-split" id="dropdownMenuSplitButton2" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuSplitButton2">
                          <h6 class="dropdown-header">Settings</h6>
                          <a class="dropdown-item" href="#">Action</a>
                          <a class="dropdown-item" href="#">Another action</a>
                          <a class="dropdown-item" href="#">Something else here</a>
                          <div class="dropdown-divider"></div>
                          <a class="dropdown-item" href="#">Separated link</a>
                        </div>
                      </div>
                      <div class="btn-group">
                        <button type="button" class="btn btn-success"> Dropdown </button>
                        <button type="button" class="btn btn-success dropdown-toggle dropdown-toggle-split" id="dropdownMenuSplitButton3" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuSplitButton3">
                          <h6 class="dropdown-header">Settings</h6>
                          <a class="dropdown-item" href="#">Action</a>
                          <a class="dropdown-item" href="#">Another action</a>
                          <a class="dropdown-item" href="#">Something else here</a>
                          <div class="dropdown-divider"></div>
                          <a class="dropdown-item" href="#">Separated link</a>
                        </div>
                      </div>
                      <div class="btn-group">
                        <button type="button" class="btn btn-secondary"> Dropdown </button>
                        <button type="button" class="btn btn-secondary dropdown-toggle dropdown-toggle-split" id="dropdownMenuSplitButton4" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuSplitButton4">
                          <h6 class="dropdown-header">Settings</h6>
                          <a class="dropdown-item" href="#">Action</a>
                          <a class="dropdown-item" href="#">Another action</a>
                          <a class="dropdown-item" href="#">Something else here</a>
                          <div class="dropdown-divider"></div>
                          <a class="dropdown-item" href="#">Separated link</a>
                        </div>
                      </div>
                      <div class="btn-group">
                        <button type="button" class="btn btn-info"> Dropdown </button>
                        <button type="button" class="btn btn-info dropdown-toggle dropdown-toggle-split" id="dropdownMenuSplitButton5" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuSplitButton5">
                          <h6 class="dropdown-header">Settings</h6>
                          <a class="dropdown-item" href="#">Action</a>
                          <a class="dropdown-item" href="#">Another action</a>
                          <a class="dropdown-item" href="#">Something else here</a>
                          <div class="dropdown-divider"></div>
                          <a class="dropdown-item" href="#">Separated link</a>
                        </div>
                      </div>
                      <div class="btn-group">
                        <button type="button" class="btn btn-warning"> Dropdown </button>
                        <button type="button" class="btn btn-warning dropdown-toggle dropdown-toggle-split" id="dropdownMenuSplitButton6" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuSplitButton6">
                          <h6 class="dropdown-header">Settings</h6>
                          <a class="dropdown-item" href="#">Action</a>
                          <a class="dropdown-item" href="#">Another action</a>
                          <a class="dropdown-item" href="#">Something else here</a>
                          <div class="dropdown-divider"></div>
                          <a class="dropdown-item" href="#">Separated link</a>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
              <div class="col-md-6 grid-margin stretch-card">
                <div class="card">
                  <div class="card-body">
                    <h4 class="card-title">Icon dropdowns</h4>
                    <p class="card-description"> Add icon tags instead of text </p>
                    <div class="row">
                      <div class="col-12">
                        <div class="template-demo d-flex justify-content-between">
                          <div class="dropdown">
                            <button class="btn btn-warning dropdown-toggle" type="button" id="dropdownMenuIconButton1" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                              <i class="mdi mdi-earth"></i>
                            </button>
                            <div class="dropdown-menu" aria-labelledby="dropdownMenuIconButton1">
                              <h6 class="dropdown-header">Settings</h6>
                              <a class="dropdown-item" href="#">Action</a>
                              <a class="dropdown-item" href="#">Another action</a>
                              <a class="dropdown-item" href="#">Something else here</a>
                              <div class="dropdown-divider"></div>
                              <a class="dropdown-item" href="#">Separated link</a>
                            </div>
                          </div>
                          <div class="dropdown">
                            <button class="btn btn-danger dropdown-toggle" type="button" id="dropdownMenuIconButton2" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                              <i class="mdi mdi-trophy-outline"></i>
                            </button>
                            <div class="dropdown-menu" aria-labelledby="dropdownMenuIconButton2">
                              <h6 class="dropdown-header">Settings</h6>
                              <a class="dropdown-item" href="#">Action</a>
                              <a class="dropdown-item" href="#">Another action</a>
                              <a class="dropdown-item" href="#">Something else here</a>
                              <div class="dropdown-divider"></div>
                              <a class="dropdown-item" href="#">Separated link</a>
                            </div>
                          </div>
                          <div class="dropdown">
                            <button type="button" class="btn btn-outline-info dropdown-toggle" id="dropdownMenuIconButton3" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                              <i class="mdi mdi-clock"></i>
                            </button>
                            <div class="dropdown-menu" aria-labelledby="dropdownMenuIconButton3">
                              <h6 class="dropdown-header">Settings</h6>
                              <a class="dropdown-item" href="#">Action</a>
                              <a class="dropdown-item" href="#">Another action</a>
                              <a class="dropdown-item" href="#">Something else here</a>
                              <div class="dropdown-divider"></div>
                              <a class="dropdown-item" href="#">Separated link</a>
                            </div>
                          </div>
                        </div>
                      </div>
                    </div>
                    <div class="row">
                      <div class="col-12">
                        <div class="template-demo d-flex justify-content-between">
                          <div class="dropdown">
                            <button type="button" class="btn btn-success dropdown-toggle" id="dropdownMenuIconButton4" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                              <i class="mdi mdi-heart"></i>
                            </button>
                            <div class="dropdown-menu" aria-labelledby="dropdownMenuIconButton4">
                              <h6 class="dropdown-header">Settings</h6>
                              <a class="dropdown-item" href="#">Action</a>
                              <a class="dropdown-item" href="#">Another action</a>
                              <a class="dropdown-item" href="#">Something else here</a>
                              <div class="dropdown-divider"></div>
                              <a class="dropdown-item" href="#">Separated link</a>
                            </div>
                          </div>
                          <div class="dropdown">
                            <button type="button" class="btn btn-warning dropdown-toggle" id="dropdownMenuIconButton5" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                              <i class="mdi mdi-logout"></i>
                            </button>
                            <div class="dropdown-menu" aria-labelledby="dropdownMenuIconButton5">
                              <h6 class="dropdown-header">Settings</h6>
                              <a class="dropdown-item" href="#">Action</a>
                              <a class="dropdown-item" href="#">Another action</a>
                              <a class="dropdown-item" href="#">Something else here</a>
                              <div class="dropdown-divider"></div>
                              <a class="dropdown-item" href="#">Separated link</a>
                            </div>
                          </div>
                          <div class="dropdown">
                            <button class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuIconButton6" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                              <i class="mdi mdi-security"></i>
                            </button>
                            <div class="dropdown-menu" aria-labelledby="dropdownMenuIconButton6">
                              <h6 class="dropdown-header">Settings</h6>
                              <a class="dropdown-item" href="#">Action</a>
                              <a class="dropdown-item" href="#">Another action</a>
                              <a class="dropdown-item" href="#">Something else here</a>
                              <div class="dropdown-divider"></div>
                              <a class="dropdown-item" href="#">Separated link</a>
                            </div>
                          </div>
                        </div>
                      </div>
                    </div>
                    <div class="row">
                      <div class="col-12">
                        <div class="template-demo d-flex justify-content-between">
                          <div class="dropdown">
                            <button type="button" class="btn btn-dark dropdown-toggle" id="dropdownMenuIconButton7" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                              <i class="mdi mdi-account"></i>
                            </button>
                            <div class="dropdown-menu" aria-labelledby="dropdownMenuIconButton7">
                              <h6 class="dropdown-header">Settings</h6>
                              <a class="dropdown-item" href="#">Action</a>
                              <a class="dropdown-item" href="#">Another action</a>
                              <a class="dropdown-item" href="#">Something else here</a>
                              <div class="dropdown-divider"></div>
                              <a class="dropdown-item" href="#">Separated link</a>
                            </div>
                          </div>
                          <div class="dropdown">
                            <button type="button" class="btn btn-info dropdown-toggle" id="dropdownMenuIconButton8" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                              <i class="mdi mdi-bell"></i>
                            </button>
                            <div class="dropdown-menu" aria-labelledby="dropdownMenuIconButton8">
                              <h6 class="dropdown-header">Settings</h6>
                              <a class="dropdown-item" href="#">Action</a>
                              <a class="dropdown-item" href="#">Another action</a>
                              <a class="dropdown-item" href="#">Something else here</a>
                              <div class="dropdown-divider"></div>
                              <a class="dropdown-item" href="#">Separated link</a>
                            </div>
                          </div>
                          <div class="dropdown">
                            <button type="button" class="btn btn-success dropdown-toggle" id="dropdownMenuIconButton7" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                              <i class="mdi mdi-account"></i>
                            </button>
                            <div class="dropdown-menu" aria-labelledby="dropdownMenuIconButton9">
                              <h6 class="dropdown-header">Settings</h6>
                              <a class="dropdown-item" href="#">Action</a>
                              <a class="dropdown-item" href="#">Another action</a>
                              <a class="dropdown-item" href="#">Something else here</a>
                              <div class="dropdown-divider"></div>
                              <a class="dropdown-item" href="#">Separated link</a>
                            </div>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
              <div class="col-lg-6 grid-margin stretch-card">
                <div class="card">
                  <div class="card-body">
                    <h4 class="card-title">Dropup variation</h4>
                    <p class="card-description"> Add class <code>.dropup</code>
                    </p>
                    <div class="template-demo">
                      <div class="btn-group dropup">
                        <button type="button" class="btn btn-primary"> Dropdown </button>
                        <button type="button" class="btn btn-primary dropdown-toggle dropdown-toggle-split" id="dropupMenuSplitButton1" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        </button>
                        <div class="dropdown-menu" aria-labelledby="dropupMenuSplitButton1">
                          <h6 class="dropdown-header">Settings</h6>
                          <a class="dropdown-item" href="#">Action</a>
                          <a class="dropdown-item" href="#">Another action</a>
                          <a class="dropdown-item" href="#">Something else here</a>
                          <div class="dropdown-divider"></div>
                          <a class="dropdown-item" href="#">Separated link</a>
                        </div>
                      </div>
                      <div class="btn-group dropup">
                        <button type="button" class="btn btn-danger"> Dropdown </button>
                        <button type="button" class="btn btn-danger dropdown-toggle dropdown-toggle-split" id="dropupMenuSplitButton2" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        </button>
                        <div class="dropdown-menu" aria-labelledby="dropupMenuSplitButton2">
                          <h6 class="dropdown-header">Settings</h6>
                          <a class="dropdown-item" href="#">Action</a>
                          <a class="dropdown-item" href="#">Another action</a>
                          <a class="dropdown-item" href="#">Something else here</a>
                          <div class="dropdown-divider"></div>
                          <a class="dropdown-item" href="#">Separated link</a>
                        </div>
                      </div>
                      <div class="btn-group dropup">
                        <button type="button" class="btn btn-success"> Dropdown </button>
                        <button type="button" class="btn btn-success dropdown-toggle dropdown-toggle-split" id="dropupMenuSplitButton3" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        </button>
                        <div class="dropdown-menu" aria-labelledby="dropupMenuSplitButton3">
                          <h6 class="dropdown-header">Settings</h6>
                          <a class="dropdown-item" href="#">Action</a>
                          <a class="dropdown-item" href="#">Another action</a>
                          <a class="dropdown-item" href="#">Something else here</a>
                          <div class="dropdown-divider"></div>
                          <a class="dropdown-item" href="#">Separated link</a>
                        </div>
                      </div>
                      <div class="btn-group dropup">
                        <button type="button" class="btn btn-secondary"> Dropdown </button>
                        <button type="button" class="btn btn-secondary dropdown-toggle dropdown-toggle-split" id="dropupMenuSplitButton4" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        </button>
                        <div class="dropdown-menu" aria-labelledby="dropupMenuSplitButton4">
                          <h6 class="dropdown-header">Settings</h6>
                          <a class="dropdown-item" href="#">Action</a>
                          <a class="dropdown-item" href="#">Another action</a>
                          <a class="dropdown-item" href="#">Something else here</a>
                          <div class="dropdown-divider"></div>
                          <a class="dropdown-item" href="#">Separated link</a>
                        </div>
                      </div>
                      <div class="btn-group dropup">
                        <button type="button" class="btn btn-info"> Dropdown </button>
                        <button type="button" class="btn btn-info dropdown-toggle dropdown-toggle-split" id="dropupMenuSplitButton5" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        </button>
                        <div class="dropdown-menu" aria-labelledby="dropupMenuSplitButton5">
                          <h6 class="dropdown-header">Settings</h6>
                          <a class="dropdown-item" href="#">Action</a>
                          <a class="dropdown-item" href="#">Another action</a>
                          <a class="dropdown-item" href="#">Something else here</a>
                          <div class="dropdown-divider"></div>
                          <a class="dropdown-item" href="#">Separated link</a>
                        </div>
                      </div>
                      <div class="btn-group dropup">
                        <button type="button" class="btn btn-warning"> Dropdown </button>
                        <button type="button" class="btn btn-warning dropdown-toggle dropdown-toggle-split" id="dropupMenuSplitButton6" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        </button>
                        <div class="dropdown-menu" aria-labelledby="dropupMenuSplitButton6">
                          <h6 class="dropdown-header">Settings</h6>
                          <a class="dropdown-item" href="#">Action</a>
                          <a class="dropdown-item" href="#">Another action</a>
                          <a class="dropdown-item" href="#">Something else here</a>
                          <div class="dropdown-divider"></div>
                          <a class="dropdown-item" href="#">Separated link</a>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
              <div class="col-lg-6 grid-margin stretch-card">
                <div class="card">
                  <div class="card-body">
                    <h4 class="card-title">Dropdown sizes</h4>
                    <p class="card-description"> Add class <code>.btn-{size}</code> to dropdown buttons </p>
                    <div class="template-demo mt-5">
                      <div class="dropdown">
                        <button class="btn btn-danger btn-lg dropdown-toggle" type="button" id="dropdownMenuSizeButton1" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> Dropdown </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuSizeButton1">
                          <h6 class="dropdown-header">Settings</h6>
                          <a class="dropdown-item" href="#">Action</a>
                          <a class="dropdown-item" href="#">Another action</a>
                          <a class="dropdown-item" href="#">Something else here</a>
                          <div class="dropdown-divider"></div>
                          <a class="dropdown-item" href="#">Separated link</a>
                        </div>
                      </div>
                      <div class="dropdown">
                        <button class="btn btn-danger dropdown-toggle" type="button" id="dropdownMenuSizeButton2" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> Dropdown </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuSizeButton2">
                          <h6 class="dropdown-header">Settings</h6>
                          <a class="dropdown-item" href="#">Action</a>
                          <a class="dropdown-item" href="#">Another action</a>
                          <a class="dropdown-item" href="#">Something else here</a>
                          <div class="dropdown-divider"></div>
                          <a class="dropdown-item" href="#">Separated link</a>
                        </div>
                      </div>
                      <div class="dropdown">
                        <button class="btn btn-danger btn-sm dropdown-toggle" type="button" id="dropdownMenuSizeButton3" data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false"> Dropdown </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuSizeButton3">
                          <h6 class="dropdown-header">Settings</h6>
                          <a class="dropdown-item" href="#">Action</a>
                          <a class="dropdown-item" href="#">Another action</a>
                          <a class="dropdown-item" href="#">Something else here</a>
                          <div class="dropdown-divider"></div>
                          <a class="dropdown-item" href="#">Separated link</a>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <!-- content-wrapper ends -->
          <!-- partial:../../partials/_footer.html -->
          <footer class="footer">
            <div class="container">
              <div class="d-sm-flex justify-content-center justify-content-sm-between">
                <span class="text-muted text-center text-sm-left d-block d-sm-inline-block">Copyright © 2021 <a href="https://www.bootstrapdash.com/" target="_blank">BootstrapDash</a>. All rights reserved.</span>
                <span class="float-none float-sm-right d-block mt-1 mt-sm-0 text-center">Hand-crafted & made with <i class="mdi mdi-heart text-danger"></i></span>
              </div>
            </div>
          </footer>
          <!-- partial -->
        </div>
        <!-- main-panel ends -->
      </div>
      <!-- page-body-wrapper ends -->
    </div>
    <!-- container-scroller -->
    <!-- plugins:js -->
    <script src="../../../assets/vendors/js/vendor.bundle.base.js"></script>
    <!-- endinject -->
    <!-- Plugin js for this page -->
    <!-- End plugin js for this page -->
    <!-- inject:js -->
    <script src="../../../assets/js/off-canvas.js"></script>
    <script src="../../../assets/js/hoverable-collapse.js"></script>
    <script src="../../../assets/js/misc.js"></script>
    <script src="../../../assets/js/settings.js"></script>
    <script src="../../../assets/js/todolist.js"></script>
    <!-- endinject -->
  </body>
</html>