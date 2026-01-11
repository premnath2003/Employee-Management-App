
import Footer from './component/Footer'
import Header from './component/Header'
import ListEmployee from './component/ListEmployee'
import {BrowserRouter, Routes, Route} from 'react-router-dom'

function App() {

  return (
    <>
    <BrowserRouter>
    <Header/>
    <Routes>
      {/* //http://localhost:3000 */}
      <Route path='/'element = {<ListEmployee/>} ></Route>
      {/* //http://localhost:3000/employee */}
      <Route path='/employee' element = {<ListEmployee/>}></Route>
      {/* //http://localhost:3000/add-employee */}
      <Route path='/add-employee' element = {<Employee/>}></Route>
      {/* //http://localhost:3000/update-employee/1 */}
      <Route path='/update-employee/:id' element = {<Employee/>}></Route>
    </Routes>
    <Footer/>
    </BrowserRouter>
    </>
  )
}

export default App
