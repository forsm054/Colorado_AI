/* Copyright (c) 2006-2014, Universities Space Research Association (USRA).
*  All rights reserved.
*
* Redistribution and use in source and binary forms, with or without
* modification, are permitted provided that the following conditions are met:
*     * Redistributions of source code must retain the above copyright
*       notice, this list of conditions and the following disclaimer.
*     * Redistributions in binary form must reproduce the above copyright
*       notice, this list of conditions and the following disclaimer in the
*       documentation and/or other materials provided with the distribution.
*     * Neither the name of the Universities Space Research Association nor the
*       names of its contributors may be used to endorse or promote products
*       derived from this software without specific prior written permission.
*
* THIS SOFTWARE IS PROVIDED BY USRA ``AS IS'' AND ANY EXPRESS OR IMPLIED
* WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
* MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
* DISCLAIMED. IN NO EVENT SHALL USRA BE LIABLE FOR ANY DIRECT, INDIRECT,
* INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
* BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS
* OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
* ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR
* TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE
* USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

#include "ArrayReference.hh"
#include "ArrayVariable.hh"
#include "Constant.hh"
#include "TestSupport.hh"
#include "test/TrivialListener.hh"
#include "UserVariable.hh"

using namespace PLEXIL;

// TODO: test bounds checking

static bool testArrayConstantReference()
{
  // Set up test data
  std::vector<bool>        vb(2);
  std::vector<int32_t>     vi(4);
  std::vector<double>      vd(4);
  std::vector<std::string> vs(4);

  vb[0] = false;
  vb[1] = true;

  vi[0] = 0;
  vi[1] = 1;
  vi[2] = 2;
  vi[3] = 3;

  vd[0] = 0;
  vd[1] = 1;
  vd[2] = 2;
  vd[3] = 3;

  vs[0] = std::string("zero");
  vs[1] = std::string("one");
  vs[2] = std::string("two");
  vs[3] = std::string("three");

  BooleanArrayConstant bc(vb);
  IntegerArrayConstant ic(vi);
  RealArrayConstant    dc(vd);
  StringArrayConstant  sc(vs);

  bool        pb;
  int32_t     pi;
  double      pd;
  std::string ps;
  
  IntegerVariable iv;
  ArrayReference bar(&bc, &iv);
  ArrayReference iar(&ic, &iv);
  ArrayReference dar(&dc, &iv);
  ArrayReference sar(&sc, &iv);

  // Check that array ref values are unknown while inactive
  assertTrue_1(!bar.isKnown());
  assertTrue_1(!iar.isKnown());
  assertTrue_1(!dar.isKnown());
  assertTrue_1(!sar.isKnown());

  int32_t n;

  // Check boolean
  bar.activate();
  assertTrue_1(iv.isActive());
  for (int32_t i = 0; i < vb.size(); ++i) {
    iv.setValue(i);
    assertTrue_1(iv.getValue(n));
    assertTrue_1(n == i);
    assertTrue_1(bar.getValue(pb));
    assertTrue_1(pb == vb[i]);
  }

  // Check integer
  iar.activate();
  assertTrue_1(iv.isActive());
  for (int32_t i = 0; i < vi.size(); ++i) {
    iv.setValue(i);
    assertTrue_1(iv.getValue(n));
    assertTrue_1(n == i);
    assertTrue_1(iar.getValue(pi));
    assertTrue_1(pi == vi[i]);
  }

  // Check double
  dar.activate();
  assertTrue_1(iv.isActive());
  for (int32_t i = 0; i < vd.size(); ++i) {
    iv.setValue(i);
    assertTrue_1(iv.getValue(n));
    assertTrue_1(n == i);
    assertTrue_1(dar.getValue(pd));
    assertTrue_1(pd == vd[i]);
  }

  // Check string
  sar.activate();
  assertTrue_1(iv.isActive());
  for (int32_t i = 0; i < vs.size(); ++i) {
    iv.setValue(i);
    assertTrue_1(iv.getValue(n));
    assertTrue_1(n == i);
    assertTrue_1(sar.getValue(ps));
    assertTrue_1(ps == vs[i]);
  }

  return true;
}

static bool testArrayVariableReference()
{
  // Set up test data
  std::vector<bool>        vb(2);
  std::vector<int32_t>     vi(4);
  std::vector<double>      vd(4);
  std::vector<std::string> vs(4);

  vb[0] = false;
  vb[1] = true;

  vi[0] = 0;
  vi[1] = 1;
  vi[2] = 2;
  vi[3] = 3;

  vd[0] = 0;
  vd[1] = 1;
  vd[2] = 2;
  vd[3] = 3;

  vs[0] = std::string("zero");
  vs[1] = std::string("one");
  vs[2] = std::string("two");
  vs[3] = std::string("three");

  BooleanArrayVariable bv(vb);
  IntegerArrayVariable iv(vi);
  RealArrayVariable    dv(vd);
  StringArrayVariable  sv(vs);

  bool        pb;
  int32_t     pi;
  double      pd;
  std::string ps;
  
  IntegerVariable ivar;
  ArrayReference bar(&bv, &ivar);
  ArrayReference iar(&iv, &ivar);
  ArrayReference dar(&dv, &ivar);
  ArrayReference sar(&sv, &ivar);

  // Check that array ref values are unknown while inactive
  assertTrue_1(!bar.isKnown());
  assertTrue_1(!iar.isKnown());
  assertTrue_1(!dar.isKnown());
  assertTrue_1(!sar.isKnown());

  // Check that arrays are inactive
  assertTrue_1(!bv.isActive());
  assertTrue_1(!iv.isActive());
  assertTrue_1(!dv.isActive());
  assertTrue_1(!sv.isActive());

  // Check that index variable is inactive
  assertTrue_1(!ivar.isActive());

  int32_t n;

  // Read tests

  // Check boolean
  bar.activate();
  assertTrue_1(bv.isActive());
  assertTrue_1(ivar.isActive());
  for (int32_t i = 0; i < vb.size(); ++i) {
    ivar.setValue(i);
    assertTrue_1(ivar.getValue(n));
    assertTrue_1(n == i);
    assertTrue_1(bar.getValue(pb));
    assertTrue_1(pb == vb[i]);
  }

  // Check integer
  iar.activate();
  assertTrue_1(iv.isActive());
  assertTrue_1(ivar.isActive());
  for (int32_t i = 0; i < vi.size(); ++i) {
    ivar.setValue(i);
    assertTrue_1(ivar.getValue(n));
    assertTrue_1(n == i);
    assertTrue_1(iar.getValue(pi));
    assertTrue_1(pi == vi[i]);
  }

  // Check double
  dar.activate();
  assertTrue_1(dv.isActive());
  assertTrue_1(ivar.isActive());
  for (int32_t i = 0; i < vd.size(); ++i) {
    ivar.setValue(i);
    assertTrue_1(ivar.getValue(n));
    assertTrue_1(n == i);
    assertTrue_1(dar.getValue(pd));
    assertTrue_1(pd == vd[i]);
  }

  // Check string
  sar.activate();
  assertTrue_1(sv.isActive());
  assertTrue_1(ivar.isActive());
  for (int32_t i = 0; i < vs.size(); ++i) {
    ivar.setValue(i);
    assertTrue_1(ivar.getValue(n));
    assertTrue_1(n == i);
    assertTrue_1(sar.getValue(ps));
    assertTrue_1(ps == vs[i]);
  }

  return true;
}

bool testMutableArrayReference()
{
  // Set up test data
  std::vector<bool>        vb(2);
  std::vector<int32_t>     vi(4);
  std::vector<double>      vd(4);
  std::vector<std::string> vs(4);

  vb[0] = false;
  vb[1] = true;

  vi[0] = 0;
  vi[1] = 1;
  vi[2] = 2;
  vi[3] = 3;

  vd[0] = 0;
  vd[1] = 1;
  vd[2] = 2;
  vd[3] = 3;

  vs[0] = std::string("zero");
  vs[1] = std::string("one");
  vs[2] = std::string("two");
  vs[3] = std::string("three");

  BooleanArrayVariable bv(vb);
  IntegerArrayVariable iv(vi);
  RealArrayVariable    dv(vd);
  StringArrayVariable  sv(vs);

  bool        pb;
  int32_t     pi;
  double      pd;
  std::string ps;
  
  IntegerVariable ivar;
  MutableArrayReference bar(&bv, &ivar);
  MutableArrayReference iar(&iv, &ivar);
  MutableArrayReference dar(&dv, &ivar);
  MutableArrayReference sar(&sv, &ivar);

  // Check that array ref values are unknown while inactive
  assertTrue_1(!bar.isKnown());
  assertTrue_1(!iar.isKnown());
  assertTrue_1(!dar.isKnown());
  assertTrue_1(!sar.isKnown());

  // Check that arrays are inactive
  assertTrue_1(!bv.isActive());
  assertTrue_1(!iv.isActive());
  assertTrue_1(!dv.isActive());
  assertTrue_1(!sv.isActive());

  // Check that index variable is inactive
  assertTrue_1(!ivar.isActive());

  int32_t n;

  // Read tests

  // Check boolean
  bar.activate();
  assertTrue_1(bv.isActive());
  assertTrue_1(ivar.isActive());
  for (int32_t i = 0; i < vb.size(); ++i) {
    ivar.setValue(i);
    assertTrue_1(ivar.getValue(n));
    assertTrue_1(n == i);
    assertTrue_1(bar.getValue(pb));
    assertTrue_1(pb == vb[i]);
  }

  // Check integer
  iar.activate();
  assertTrue_1(iv.isActive());
  assertTrue_1(ivar.isActive());
  for (int32_t i = 0; i < vi.size(); ++i) {
    ivar.setValue(i);
    assertTrue_1(ivar.getValue(n));
    assertTrue_1(n == i);
    assertTrue_1(iar.getValue(pi));
    assertTrue_1(pi == vi[i]);
  }

  // Check double
  dar.activate();
  assertTrue_1(dv.isActive());
  assertTrue_1(ivar.isActive());
  for (int32_t i = 0; i < vd.size(); ++i) {
    ivar.setValue(i);
    assertTrue_1(ivar.getValue(n));
    assertTrue_1(n == i);
    assertTrue_1(dar.getValue(pd));
    assertTrue_1(pd == vd[i]);
  }

  // Check string
  sar.activate();
  assertTrue_1(sv.isActive());
  assertTrue_1(ivar.isActive());
  for (int32_t i = 0; i < vs.size(); ++i) {
    ivar.setValue(i);
    assertTrue_1(ivar.getValue(n));
    assertTrue_1(n == i);
    assertTrue_1(sar.getValue(ps));
    assertTrue_1(ps == vs[i]);
  }

  // Write tests

  // Boolean
  for (int32_t i = 0; i < vb.size(); ++i) {
    ivar.setValue(i);
    assertTrue_1(ivar.getValue(n));
    assertTrue_1(n == i);
    assertTrue_1(bar.getValue(pb));
    assertTrue_1(pb == vb[i]);
    bar.setValue(!pb);
    assertTrue_1(bar.getValue(pb));
    assertTrue_1(pb == !vb[i]);
  }
  
  // Integer
  for (int32_t i = 0; i < vi.size(); ++i) {
    ivar.setValue(i);
    assertTrue_1(ivar.getValue(n));
    assertTrue_1(n == i);
    assertTrue_1(iar.getValue(pi));
    assertTrue_1(pi == vi[i]);
    iar.setValue(-pi);
    pi = 0;
    assertTrue_1(iar.getValue(pi));
    assertTrue_1(pi == -vi[i]);
  }

  // Real
  for (int32_t i = 0; i < vd.size(); ++i) {
    ivar.setValue(i);
    assertTrue_1(ivar.getValue(n));
    assertTrue_1(n == i);
    assertTrue_1(dar.getValue(pd));
    assertTrue_1(pd == vd[i]);
    dar.setValue(-pd);
    pd = 0;
    assertTrue_1(dar.getValue(pd));
    assertTrue_1(pd == -vd[i]);
  }

  // String
  for (int32_t i = 0; i < vs.size(); ++i) {
    ivar.setValue(i);
    assertTrue_1(ivar.getValue(n));
    assertTrue_1(n == i);
    assertTrue_1(sar.getValue(ps));
    assertTrue_1(ps == vs[i]);
    ps.push_back('x');
    sar.setValue(ps);
    ps.clear();
    assertTrue_1(sar.getValue(ps));
    assertTrue_1(ps != vs[i]);
    assertTrue_1(ps.substr(0, ps.size() -1) == vs[i]);
  }

  // setUnknown tests
  // First, reset arrays
  bv.deactivate();
  iv.deactivate();
  dv.deactivate();
  sv.deactivate();
  bv.reset();
  iv.reset();
  dv.reset();
  sv.reset();
  bv.activate();
  iv.activate();
  dv.activate();
  sv.activate();

  // Boolean
  for (int32_t i = 0; i < vb.size(); ++i) {
    ivar.setValue(i);
    assertTrue_1(ivar.getValue(n));
    assertTrue_1(n == i);
    assertTrue_1(bar.getValue(pb));
    assertTrue_1(pb == vb[i]);
    bar.setUnknown();
    assertTrue_1(!bar.isKnown());
    assertTrue_1(!bar.getValue(pb));
    assertTrue_1(bv.isKnown());
  }
  
  // Integer
  for (int32_t i = 0; i < vi.size(); ++i) {
    ivar.setValue(i);
    assertTrue_1(ivar.getValue(n));
    assertTrue_1(n == i);
    assertTrue_1(iar.getValue(pi));
    assertTrue_1(pi == vi[i]);
    iar.setUnknown();
    assertTrue_1(!iar.isKnown());
    assertTrue_1(!iar.getValue(pi));
    assertTrue_1(iv.isKnown());
  }

  // Real
  for (int32_t i = 0; i < vd.size(); ++i) {
    ivar.setValue(i);
    assertTrue_1(ivar.getValue(n));
    assertTrue_1(n == i);
    assertTrue_1(dar.getValue(pd));
    assertTrue_1(pd == vd[i]);
    dar.setUnknown();
    assertTrue_1(!dar.isKnown());
    assertTrue_1(!dar.getValue(pd));
    assertTrue_1(dv.isKnown());
  }

  // String
  for (int32_t i = 0; i < vs.size(); ++i) {
    ivar.setValue(i);
    assertTrue_1(ivar.getValue(n));
    assertTrue_1(n == i);
    assertTrue_1(sar.getValue(ps));
    assertTrue_1(ps == vs[i]);
    sar.setUnknown();
    assertTrue_1(!sar.isKnown());
    assertTrue_1(!sar.getValue(ps));
    assertTrue_1(sv.isKnown());
  }

  return true;
}

bool testAssignablePointer()
{
  // Set up test data
  std::vector<bool>        vb(2);
  std::vector<int32_t>     vi(4);
  std::vector<double>      vd(4);
  std::vector<std::string> vs(4);

  vb[0] = false;
  vb[1] = true;

  vi[0] = 0;
  vi[1] = 1;
  vi[2] = 2;
  vi[3] = 3;

  vd[0] = 0;
  vd[1] = 1;
  vd[2] = 2;
  vd[3] = 3;

  vs[0] = std::string("zero");
  vs[1] = std::string("one");
  vs[2] = std::string("two");
  vs[3] = std::string("three");

  BooleanArrayVariable bv(vb);
  IntegerArrayVariable iv(vi);
  RealArrayVariable    dv(vd);
  StringArrayVariable  sv(vs);

  Assignable *bvp = bv.asAssignable();
  Assignable *ivp = iv.asAssignable();
  Assignable *dvp = dv.asAssignable();
  Assignable *svp = sv.asAssignable();

  bool        pb;
  int32_t     pi;
  double      pd;
  std::string ps;
  
  IntegerVariable ivar;
  MutableArrayReference bar(bvp, &ivar);
  MutableArrayReference iar(ivp, &ivar);
  MutableArrayReference dar(dvp, &ivar);
  MutableArrayReference sar(svp, &ivar);

  Assignable *barp = bar.asAssignable();
  Assignable *iarp = iar.asAssignable();
  Assignable *darp = dar.asAssignable();
  Assignable *sarp = sar.asAssignable();

  // Check that array ref values are unknown while inactive
  assertTrue_1(!barp->isKnown());
  assertTrue_1(!iarp->isKnown());
  assertTrue_1(!darp->isKnown());
  assertTrue_1(!sarp->isKnown());

  // Check that arrays are inactive
  assertTrue_1(!bvp->isActive());
  assertTrue_1(!ivp->isActive());
  assertTrue_1(!dvp->isActive());
  assertTrue_1(!svp->isActive());

  // Check that index variable is inactive
  assertTrue_1(!ivar.isActive());

  int32_t n;

  // Read tests

  // Check boolean
  barp->activate();
  assertTrue_1(bvp->isActive());
  assertTrue_1(ivar.isActive());
  for (int32_t i = 0; i < vb.size(); ++i) {
    ivar.setValue(i);
    assertTrue_1(ivar.getValue(n));
    assertTrue_1(n == i);
    assertTrue_1(barp->getValue(pb));
    assertTrue_1(pb == vb[i]);
  }

  // Check integer
  iarp->activate();
  assertTrue_1(ivp->isActive());
  assertTrue_1(ivar.isActive());
  for (int32_t i = 0; i < vi.size(); ++i) {
    ivar.setValue(i);
    assertTrue_1(ivar.getValue(n));
    assertTrue_1(n == i);
    assertTrue_1(iarp->getValue(pi));
    assertTrue_1(pi == vi[i]);
  }

  // Check double
  darp->activate();
  assertTrue_1(dvp->isActive());
  assertTrue_1(ivar.isActive());
  for (int32_t i = 0; i < vd.size(); ++i) {
    ivar.setValue(i);
    assertTrue_1(ivar.getValue(n));
    assertTrue_1(n == i);
    assertTrue_1(darp->getValue(pd));
    assertTrue_1(pd == vd[i]);
  }

  // Check string
  sarp->activate();
  assertTrue_1(svp->isActive());
  assertTrue_1(ivar.isActive());
  for (int32_t i = 0; i < vs.size(); ++i) {
    ivar.setValue(i);
    assertTrue_1(ivar.getValue(n));
    assertTrue_1(n == i);
    assertTrue_1(sarp->getValue(ps));
    assertTrue_1(ps == vs[i]);
  }

  // Write tests

  // Boolean
  for (int32_t i = 0; i < vb.size(); ++i) {
    ivar.setValue(i);
    assertTrue_1(ivar.getValue(n));
    assertTrue_1(n == i);
    assertTrue_1(barp->getValue(pb));
    assertTrue_1(pb == vb[i]);
    barp->setValue(!pb);
    assertTrue_1(barp->getValue(pb));
    assertTrue_1(pb == !vb[i]);
  }
  
  // Integer
  for (int32_t i = 0; i < vi.size(); ++i) {
    ivar.setValue(i);
    assertTrue_1(ivar.getValue(n));
    assertTrue_1(n == i);
    assertTrue_1(iarp->getValue(pi));
    assertTrue_1(pi == vi[i]);
    iarp->setValue(-pi);
    pi = 0;
    assertTrue_1(iarp->getValue(pi));
    assertTrue_1(pi == -vi[i]);
  }

  // Real
  for (int32_t i = 0; i < vd.size(); ++i) {
    ivar.setValue(i);
    assertTrue_1(ivar.getValue(n));
    assertTrue_1(n == i);
    assertTrue_1(darp->getValue(pd));
    assertTrue_1(pd == vd[i]);
    darp->setValue(-pd);
    pd = 0;
    assertTrue_1(darp->getValue(pd));
    assertTrue_1(pd == -vd[i]);
  }

  // String
  for (int32_t i = 0; i < vs.size(); ++i) {
    ivar.setValue(i);
    assertTrue_1(ivar.getValue(n));
    assertTrue_1(n == i);
    assertTrue_1(sarp->getValue(ps));
    assertTrue_1(ps == vs[i]);
    ps.push_back('x');
    sarp->setValue(ps);
    ps.clear();
    assertTrue_1(sarp->getValue(ps));
    assertTrue_1(ps != vs[i]);
    assertTrue_1(ps.substr(0, ps.size() -1) == vs[i]);
  }

  // setUnknown tests
  // First, reset arrays
  bvp->deactivate();
  ivp->deactivate();
  dvp->deactivate();
  svp->deactivate();
  bvp->reset();
  ivp->reset();
  dvp->reset();
  svp->reset();
  bvp->activate();
  ivp->activate();
  dvp->activate();
  svp->activate();

  // Boolean
  for (int32_t i = 0; i < vb.size(); ++i) {
    ivar.setValue(i);
    assertTrue_1(ivar.getValue(n));
    assertTrue_1(n == i);
    assertTrue_1(barp->getValue(pb));
    assertTrue_1(pb == vb[i]);
    barp->setUnknown();
    assertTrue_1(!barp->isKnown());
    assertTrue_1(!barp->getValue(pb));
    assertTrue_1(bvp->isKnown());
  }
  
  // Integer
  for (int32_t i = 0; i < vi.size(); ++i) {
    ivar.setValue(i);
    assertTrue_1(ivar.getValue(n));
    assertTrue_1(n == i);
    assertTrue_1(iarp->getValue(pi));
    assertTrue_1(pi == vi[i]);
    iarp->setUnknown();
    assertTrue_1(!iarp->isKnown());
    assertTrue_1(!iarp->getValue(pi));
    assertTrue_1(ivp->isKnown());
  }

  // Real
  for (int32_t i = 0; i < vd.size(); ++i) {
    ivar.setValue(i);
    assertTrue_1(ivar.getValue(n));
    assertTrue_1(n == i);
    assertTrue_1(darp->getValue(pd));
    assertTrue_1(pd == vd[i]);
    darp->setUnknown();
    assertTrue_1(!darp->isKnown());
    assertTrue_1(!darp->getValue(pd));
    assertTrue_1(dvp->isKnown());
  }

  // String
  for (int32_t i = 0; i < vs.size(); ++i) {
    ivar.setValue(i);
    assertTrue_1(ivar.getValue(n));
    assertTrue_1(n == i);
    assertTrue_1(sarp->getValue(ps));
    assertTrue_1(ps == vs[i]);
    sarp->setUnknown();
    assertTrue_1(!sarp->isKnown());
    assertTrue_1(!sarp->getValue(ps));
    assertTrue_1(svp->isKnown());
  }

  return true;
}

bool testArrayRefNotification()
{
  // Set up test data
  std::vector<bool>        vb(2);
  std::vector<int32_t>     vi(4);
  std::vector<double>      vd(4);
  std::vector<std::string> vs(4);

  vb[0] = false;
  vb[1] = true;

  vi[0] = 0;
  vi[1] = 1;
  vi[2] = 2;
  vi[3] = 3;

  vd[0] = 0;
  vd[1] = 1;
  vd[2] = 2;
  vd[3] = 3;

  vs[0] = std::string("zero");
  vs[1] = std::string("one");
  vs[2] = std::string("two");
  vs[3] = std::string("three");

  IntegerVariable ivar;
  bool ivarChanged = false;
  TrivialListener ivarl(ivarChanged);
  ivar.addListener(&ivarl);

  BooleanArrayVariable bv(vb);
  bool bvChanged = false;
  TrivialListener bvl(bvChanged);
  bv.addListener(&bvl);

  IntegerArrayVariable iv(vi);
  bool ivChanged = false;
  TrivialListener ivl(ivChanged);
  iv.addListener(&ivl);

  RealArrayVariable    dv(vd);
  bool dvChanged = false;
  TrivialListener dvl(dvChanged);
  dv.addListener(&dvl);

  StringArrayVariable  sv(vs);
  bool svChanged = false;
  TrivialListener svl(svChanged);
  sv.addListener(&svl);

  ArrayReference bar(&bv, &ivar);
  bool barChanged = false;
  TrivialListener barl(barChanged);
  bar.addListener(&barl);

  ArrayReference iar(&iv, &ivar);
  bool iarChanged = false;
  TrivialListener iarl(iarChanged);
  iar.addListener(&iarl);

  ArrayReference dar(&dv, &ivar);
  bool darChanged = false;
  TrivialListener darl(darChanged);
  dar.addListener(&darl);

  ArrayReference sar(&sv, &ivar);
  bool sarChanged = false;
  TrivialListener sarl(sarChanged);
  sar.addListener(&sarl);

  Constant<bool> dummy;

  // Check that nothing propagates while inactive
  ivar.notifyChanged(&dummy);
  assertTrue_1(!ivarChanged);
  assertTrue_1(!bvChanged);
  assertTrue_1(!ivChanged);
  assertTrue_1(!dvChanged);
  assertTrue_1(!svChanged);
  assertTrue_1(!barChanged);
  assertTrue_1(!iarChanged);
  assertTrue_1(!darChanged);
  assertTrue_1(!sarChanged);

  // Activate arrays before refs
  ivar.activate();
  bar.activate();
  iar.activate();
  dar.activate();
  sar.activate();
  bv.activate();
  iv.activate();
  dv.activate();
  sv.activate();

  // Activating should cause arrays to show change due to initialization, but not ivar
  // Change should propagate to references
  assertTrue_1(!ivarChanged);
  assertTrue_1(bvChanged);
  assertTrue_1(ivChanged);
  assertTrue_1(dvChanged);
  assertTrue_1(svChanged);
  assertTrue_1(barChanged);
  assertTrue_1(iarChanged);
  assertTrue_1(darChanged);
  assertTrue_1(sarChanged);

  // Check that setting ivar propagates to all array refs but not arrays
  bvChanged = ivChanged = dvChanged = svChanged = false;
  barChanged = iarChanged = darChanged = sarChanged = false;

  ivar.setValue((int32_t) 0);
  assertTrue_1(ivarChanged);
  assertTrue_1(!bvChanged);
  assertTrue_1(!ivChanged);
  assertTrue_1(!dvChanged);
  assertTrue_1(!svChanged);
  assertTrue_1(barChanged);
  assertTrue_1(iarChanged);
  assertTrue_1(darChanged);
  assertTrue_1(sarChanged);

  // Changing array should propagate to refs but not ivar
  ivarChanged = barChanged = iarChanged = darChanged = sarChanged = false;
  bv.notifyChanged(&dummy);
  assertTrue_1(!ivarChanged);
  assertTrue_1(bvChanged);
  assertTrue_1(!ivChanged);
  assertTrue_1(!dvChanged);
  assertTrue_1(!svChanged);
  assertTrue_1(barChanged);
  assertTrue_1(!iarChanged);
  assertTrue_1(!darChanged);
  assertTrue_1(!sarChanged);
  
  bvChanged = barChanged = false;
  iv.notifyChanged(&dummy);
  assertTrue_1(!ivarChanged);
  assertTrue_1(!bvChanged);
  assertTrue_1(ivChanged);
  assertTrue_1(!dvChanged);
  assertTrue_1(!svChanged);
  assertTrue_1(!barChanged);
  assertTrue_1(iarChanged);
  assertTrue_1(!darChanged);
  assertTrue_1(!sarChanged);
  
  ivChanged = iarChanged = false;
  dv.notifyChanged(&dummy);
  assertTrue_1(!ivarChanged);
  assertTrue_1(!bvChanged);
  assertTrue_1(!ivChanged);
  assertTrue_1(dvChanged);
  assertTrue_1(!svChanged);
  assertTrue_1(!barChanged);
  assertTrue_1(!iarChanged);
  assertTrue_1(darChanged);
  assertTrue_1(!sarChanged);
  
  dvChanged = darChanged = false;
  sv.notifyChanged(&dummy);
  assertTrue_1(!ivarChanged);
  assertTrue_1(!bvChanged);
  assertTrue_1(!ivChanged);
  assertTrue_1(!dvChanged);
  assertTrue_1(svChanged);
  assertTrue_1(!barChanged);
  assertTrue_1(!iarChanged);
  assertTrue_1(!darChanged);
  assertTrue_1(sarChanged);

  // Deactivate refs first, arrays next
  bar.deactivate();
  iar.deactivate();
  dar.deactivate();
  sar.deactivate();
  bv.deactivate();
  iv.deactivate();
  dv.deactivate();
  sv.deactivate();
  ivar.deactivate();
  assertTrue_1(!ivar.isActive());
  assertTrue_1(!bv.isActive());
  assertTrue_1(!iv.isActive());
  assertTrue_1(!dv.isActive());
  assertTrue_1(!sv.isActive());
  assertTrue_1(!bar.isActive());
  assertTrue_1(!iar.isActive());
  assertTrue_1(!dar.isActive());
  assertTrue_1(!sar.isActive());

  // Clean up
  ivar.removeListener(&ivarl);
  bv.removeListener(&bvl);
  iv.removeListener(&ivl);
  dv.removeListener(&dvl);
  sv.removeListener(&svl);
  bar.removeListener(&barl);
  iar.removeListener(&iarl);
  dar.removeListener(&darl);
  sar.removeListener(&sarl);

  return true;
}

bool testMutableNotification()
{
  // Set up test data
  std::vector<bool>        vb(2);
  std::vector<int32_t>     vi(4);
  std::vector<double>      vd(4);
  std::vector<std::string> vs(4);

  vb[0] = false;
  vb[1] = true;

  vi[0] = 0;
  vi[1] = 1;
  vi[2] = 2;
  vi[3] = 3;

  vd[0] = 0;
  vd[1] = 1;
  vd[2] = 2;
  vd[3] = 3;

  vs[0] = std::string("zero");
  vs[1] = std::string("one");
  vs[2] = std::string("two");
  vs[3] = std::string("three");

  IntegerVariable ivar;
  bool ivarChanged = false;
  TrivialListener ivarl(ivarChanged);
  ivar.addListener(&ivarl);

  BooleanArrayVariable bv(vb);
  bool bvChanged = false;
  TrivialListener bvl(bvChanged);
  bv.addListener(&bvl);

  IntegerArrayVariable iv(vi);
  bool ivChanged = false;
  TrivialListener ivl(ivChanged);
  iv.addListener(&ivl);

  RealArrayVariable    dv(vd);
  bool dvChanged = false;
  TrivialListener dvl(dvChanged);
  dv.addListener(&dvl);

  StringArrayVariable  sv(vs);
  bool svChanged = false;
  TrivialListener svl(svChanged);
  sv.addListener(&svl);

  MutableArrayReference bar(&bv, &ivar);
  bool barChanged = false;
  TrivialListener barl(barChanged);
  bar.addListener(&barl);

  MutableArrayReference iar(&iv, &ivar);
  bool iarChanged = false;
  TrivialListener iarl(iarChanged);
  iar.addListener(&iarl);

  MutableArrayReference dar(&dv, &ivar);
  bool darChanged = false;
  TrivialListener darl(darChanged);
  dar.addListener(&darl);

  MutableArrayReference sar(&sv, &ivar);
  bool sarChanged = false;
  TrivialListener sarl(sarChanged);
  sar.addListener(&sarl);

  Constant<bool> dummy;

  // Check that nothing propagates while inactive
  ivar.notifyChanged(&dummy);
  assertTrue_1(!ivarChanged);
  assertTrue_1(!bvChanged);
  assertTrue_1(!ivChanged);
  assertTrue_1(!dvChanged);
  assertTrue_1(!svChanged);
  assertTrue_1(!barChanged);
  assertTrue_1(!iarChanged);
  assertTrue_1(!darChanged);
  assertTrue_1(!sarChanged);

  // Activate arrays before refs
  ivar.activate();
  bar.activate();
  iar.activate();
  dar.activate();
  sar.activate();
  bv.activate();
  iv.activate();
  dv.activate();
  sv.activate();

  // Activating should cause arrays to show change due to initialization, but not ivar
  // Change should propagate to references
  assertTrue_1(!ivarChanged);
  assertTrue_1(bvChanged);
  assertTrue_1(ivChanged);
  assertTrue_1(dvChanged);
  assertTrue_1(svChanged);
  assertTrue_1(barChanged);
  assertTrue_1(iarChanged);
  assertTrue_1(darChanged);
  assertTrue_1(sarChanged);

  // Check that setting ivar propagates to all array refs but not arrays
  bvChanged = ivChanged = dvChanged = svChanged = false;
  barChanged = iarChanged = darChanged = sarChanged = false;

  ivar.setValue((int32_t) 0);
  assertTrue_1(ivarChanged);
  assertTrue_1(!bvChanged);
  assertTrue_1(!ivChanged);
  assertTrue_1(!dvChanged);
  assertTrue_1(!svChanged);
  assertTrue_1(barChanged);
  assertTrue_1(iarChanged);
  assertTrue_1(darChanged);
  assertTrue_1(sarChanged);

  // Changing array should propagate to refs but not ivar
  ivarChanged = barChanged = iarChanged = darChanged = sarChanged = false;
  bv.notifyChanged(&dummy);
  assertTrue_1(!ivarChanged);
  assertTrue_1(bvChanged);
  assertTrue_1(!ivChanged);
  assertTrue_1(!dvChanged);
  assertTrue_1(!svChanged);
  assertTrue_1(barChanged);
  assertTrue_1(!iarChanged);
  assertTrue_1(!darChanged);
  assertTrue_1(!sarChanged);
  
  bvChanged = barChanged = false;
  iv.notifyChanged(&dummy);
  assertTrue_1(!ivarChanged);
  assertTrue_1(!bvChanged);
  assertTrue_1(ivChanged);
  assertTrue_1(!dvChanged);
  assertTrue_1(!svChanged);
  assertTrue_1(!barChanged);
  assertTrue_1(iarChanged);
  assertTrue_1(!darChanged);
  assertTrue_1(!sarChanged);
  
  ivChanged = iarChanged = false;
  dv.notifyChanged(&dummy);
  assertTrue_1(!ivarChanged);
  assertTrue_1(!bvChanged);
  assertTrue_1(!ivChanged);
  assertTrue_1(dvChanged);
  assertTrue_1(!svChanged);
  assertTrue_1(!barChanged);
  assertTrue_1(!iarChanged);
  assertTrue_1(darChanged);
  assertTrue_1(!sarChanged);
  
  dvChanged = darChanged = false;
  sv.notifyChanged(&dummy);
  assertTrue_1(!ivarChanged);
  assertTrue_1(!bvChanged);
  assertTrue_1(!ivChanged);
  assertTrue_1(!dvChanged);
  assertTrue_1(svChanged);
  assertTrue_1(!barChanged);
  assertTrue_1(!iarChanged);
  assertTrue_1(!darChanged);
  assertTrue_1(sarChanged);

  svChanged = sarChanged = false;

  // Setting array refs should cause arrays to change but not ivar
  // Propagation could cause infinite loop here: ref -> array -> ref ...
  // ivar == 0
  bar.setValue(true);
  assertTrue_1(!ivarChanged);
  assertTrue_1(bvChanged);
  assertTrue_1(!ivChanged);
  assertTrue_1(!dvChanged);
  assertTrue_1(!svChanged);
  assertTrue_1(barChanged);
  assertTrue_1(!iarChanged);
  assertTrue_1(!darChanged);
  assertTrue_1(!sarChanged);

  bvChanged = barChanged = false;
  iar.setValue((int32_t) 4);
  assertTrue_1(!ivarChanged);
  assertTrue_1(!bvChanged);
  assertTrue_1(ivChanged);
  assertTrue_1(!dvChanged);
  assertTrue_1(!svChanged);
  assertTrue_1(!barChanged);
  assertTrue_1(iarChanged);
  assertTrue_1(!darChanged);
  assertTrue_1(!sarChanged);

  ivChanged = iarChanged = false;
  dar.setValue(4.0);
  assertTrue_1(!ivarChanged);
  assertTrue_1(!bvChanged);
  assertTrue_1(!ivChanged);
  assertTrue_1(dvChanged);
  assertTrue_1(!svChanged);
  assertTrue_1(!barChanged);
  assertTrue_1(!iarChanged);
  assertTrue_1(darChanged);
  assertTrue_1(!sarChanged);

  dvChanged = darChanged = false;
  sar.setValue(std::string("fore"));
  assertTrue_1(!ivarChanged);
  assertTrue_1(!bvChanged);
  assertTrue_1(!ivChanged);
  assertTrue_1(!dvChanged);
  assertTrue_1(svChanged);
  assertTrue_1(!barChanged);
  assertTrue_1(!iarChanged);
  assertTrue_1(!darChanged);
  assertTrue_1(sarChanged);

  // Deactivate refs first, arrays next
  bar.deactivate();
  iar.deactivate();
  dar.deactivate();
  sar.deactivate();
  bv.deactivate();
  iv.deactivate();
  dv.deactivate();
  sv.deactivate();
  ivar.deactivate();
  assertTrue_1(!ivar.isActive());
  assertTrue_1(!bv.isActive());
  assertTrue_1(!iv.isActive());
  assertTrue_1(!dv.isActive());
  assertTrue_1(!sv.isActive());
  assertTrue_1(!bar.isActive());
  assertTrue_1(!iar.isActive());
  assertTrue_1(!dar.isActive());
  assertTrue_1(!sar.isActive());

  // Clean up
  ivar.removeListener(&ivarl);
  bv.removeListener(&bvl);
  iv.removeListener(&ivl);
  dv.removeListener(&dvl);
  sv.removeListener(&svl);
  bar.removeListener(&barl);
  iar.removeListener(&iarl);
  dar.removeListener(&darl);
  sar.removeListener(&sarl);

  return true;
}

bool arrayReferenceTest()
{
  runTest(testArrayConstantReference);
  runTest(testArrayVariableReference);
  runTest(testMutableArrayReference);
  runTest(testAssignablePointer);
  runTest(testArrayRefNotification);
  runTest(testMutableNotification);
  return true;
}